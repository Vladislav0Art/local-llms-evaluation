package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertFileInfo {

    @Test
    public void convertFileInfo() {
        // Arrange
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFileName("example.txt");
        fileInfo.setContent("Hello World");

        // Act
        String result = new JacksonJsonTransformer().convert(fileInfo);

        // Assert
        assertNotNull(result);
        assertTrue(result.contains("\"fileName\":\"example.txt\""));
    }

}