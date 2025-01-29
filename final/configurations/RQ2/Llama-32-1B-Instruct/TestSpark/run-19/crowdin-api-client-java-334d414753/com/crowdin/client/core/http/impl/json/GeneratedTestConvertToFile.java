package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GeneratedTestConvertToFile {

    @Test
    public void testConvertToFile() throws IOException {
        ObjectMapper objectMapper = createObjectMapper();
        FileInfo fileInfo = objectMapper.readValue(new FileInputStream("test.json"), FileInfo.class);
        Project project = objectMapper.readValue(fileInfo.getJson(), Project.class);
        assertEquals(project, project);
    }

    private static ObjectMapper createObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

}