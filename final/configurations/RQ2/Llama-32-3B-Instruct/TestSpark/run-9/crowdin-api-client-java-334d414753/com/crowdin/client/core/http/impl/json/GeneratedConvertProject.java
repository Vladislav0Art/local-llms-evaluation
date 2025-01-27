package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertProject {

    @Test
    public void convertProject() {
        // Arrange
        Project project = new Project();
        project.setId("12345");
        project.setName("Example Project");

        // Act
        String result = new JacksonJsonTransformer().convert(project);

        // Assert
        assertNotNull(result);
        assertTrue(result.contains("\"id\":\"12345\""));
    }

}