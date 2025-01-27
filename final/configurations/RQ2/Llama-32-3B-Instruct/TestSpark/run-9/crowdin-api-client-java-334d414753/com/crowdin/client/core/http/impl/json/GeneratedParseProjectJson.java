package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseProjectJson {

    @Test
    public void parseProjectJson() {
        // Arrange
        String json = "{\"id\":\"12345\",\"name\":\"Example Project\"}";
        Class<Project> clazz = Project.class;

        // Act
        Object result = new JacksonJsonTransformer().parse(json, clazz);

        // Assert
        assertNotNull(result);
        assertTrue(result instanceof Project);
    }

}