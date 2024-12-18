package com.github.davidmoten.oas3.puml;

import static com.github.davidmoten.oas3.puml.Converter.openApiToPuml;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class GeneratedTestOpenApiToPuml {

    @Test
    public void testOpenApiToPuml() throws IOException {
        String openApi = new String(Files.readAllBytes(Paths.get("src/test/resources/openapi.json")));
        String expectedPuml = new String(Files.readAllBytes(Paths.get("src/test/resources/expected.puml")));
        assertEquals(expectedPuml, openApiToPuml(openApi));
    }

}