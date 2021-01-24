package org.cplee.sampleapi;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.io.InputStream;
import java.util.Properties;

@Testcontainers
public class SampleApiIT {
    @Container
    public static GenericContainer api = new GenericContainer(DockerImageName.parse(System.getProperty("sampleApi.image")))
            .withExposedPorts(8080);

    @BeforeAll
    static void beforeAll() {
        String apiUrl = String.format("http://%s:%d", api.getHost(), api.getFirstMappedPort());
        System.setProperty("sampleApi.baseUrl", apiUrl);
        System.setProperty("karate.env", "local");
    }

    @Karate.Test
    Karate testAll() {
        return new Karate().feature("classpath:karate");
    }
}
