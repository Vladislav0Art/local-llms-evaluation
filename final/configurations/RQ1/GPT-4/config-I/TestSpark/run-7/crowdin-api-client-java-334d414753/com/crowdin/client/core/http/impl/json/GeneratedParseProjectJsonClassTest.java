package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseProjectJsonClassTest {

    @Test
    public void parseProjectJsonClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Project name\"}";

        Project project = transformer.parse(json, Project.class);

        assertNotNull(project);
        assertEquals(Long.valueOf(1), project.getId());
        assertEquals("Project name", project.getName());
    }

}