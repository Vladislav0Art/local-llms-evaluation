package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    private JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseValidJsonStringToProjectTest() {
        String jsonString = "{\"id\":1,\"name\":\"Test project\",\"description\":\"TDD project\"}";

        Project project = jsonTransformer.parse(jsonString, Project.class);

        assertNotNull(project);
        assertEquals((Long) 1L, project.getId());
        assertEquals("Test project", project.getName());
        assertEquals("TDD project", project.getDescription());
    }

    @Test
    public void parseInValidJsonStringToProjectTest() {
        String jsonString = "{\"id\":\"one\",\"name\":\"Test project\",\"description\":\"TDD project\"}";

        jsonTransformer.parse(jsonString, Project.class);
    }

    @Test
    public void convertProjectToValidJsonStringTest() {
        Project project = new Project();
        project.setId(1L);
        project.setName("Test project");
        project.setDescription("TDD project");

        String jsonString = jsonTransformer.convert(project);

        assertEquals("{\"id\":1,\"name\":\"Test project\",\"description\":\"TDD project\"}", jsonString);
    }

    @Test
    public void convertInvalidObjectToJsonStringTest() {
        FileInfo fileInfo = new FileInfo();

        jsonTransformer.convert(fileInfo);
    }

}