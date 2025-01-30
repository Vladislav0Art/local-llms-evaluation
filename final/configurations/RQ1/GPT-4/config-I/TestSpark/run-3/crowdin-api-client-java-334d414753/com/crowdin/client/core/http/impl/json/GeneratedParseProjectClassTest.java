package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseProjectClassTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseProjectClassTest() throws JsonProcessingException {
        String json = "{\"id\":1,\"name\":\"Project name\"}";
        Project project = transformer.parse(json, Project.class);

        Assert.assertEquals((Long) 1L, project.getId());
        Assert.assertEquals("Project name", project.getName());
    }

}