package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseExportOptionsJson {

    @Test
    public void parseExportOptionsJson() {
        // Arrange
        String json = "{\"options\":{\"language\":\"en\"}}";
        Class<ExportOptions> clazz = ExportOptions.class;

        // Act
        Object result = new JacksonJsonTransformer().parse(json, clazz);

        // Assert
        assertNotNull(result);
        assertTrue(result instanceof ExportOptions);
    }

}