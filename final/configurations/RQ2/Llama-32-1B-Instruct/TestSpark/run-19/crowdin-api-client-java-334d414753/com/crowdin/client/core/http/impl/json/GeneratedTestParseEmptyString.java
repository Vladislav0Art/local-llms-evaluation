package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GeneratedTestParseEmptyString {

    @Test
    public void testParseEmptyString() throws Exception {
        ObjectMapper objectMapper = createObjectMapper();
        String json = "";
        try {
            Project project = objectMapper.readValue(json, Project.class);
            assertNotNull(project);
        } catch (Exception e) {
            // Handle exception
        }
    }

}