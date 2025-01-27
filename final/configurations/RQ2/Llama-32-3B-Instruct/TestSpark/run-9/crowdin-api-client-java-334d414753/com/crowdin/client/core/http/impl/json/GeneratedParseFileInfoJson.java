package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseFileInfoJson {

    @Test
    public void parseFileInfoJson() {
        // Arrange
        String json = "{\"fileName\":\"example.txt\",\"content\":\"Hello World\"}";
        Class<FileInfo> clazz = FileInfo.class;

        // Act
        Object result = new JacksonJsonTransformer().parse(json, clazz);

        // Assert
        assertNotNull(result);
        assertTrue(result instanceof FileInfo);
    }

}