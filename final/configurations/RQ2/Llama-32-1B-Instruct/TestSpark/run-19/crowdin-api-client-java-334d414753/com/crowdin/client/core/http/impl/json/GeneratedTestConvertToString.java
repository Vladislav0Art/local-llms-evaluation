package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GeneratedTestConvertToString {

    @Test
    public void testConvertToString() throws IOException {
        String json = "{\"name\":\"project\",\"id\":1}";
        ObjectMapper objectMapper = createObjectMapper();
        Project project = objectMapper.readValue(json, Project.class);
        assertEquals(project, project);
    }

}