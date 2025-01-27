package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.lang.reflect.Type;

public class GeneratedParseProject {

    @Mock
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    public com.crowdin.client.core.http.impl.json.JacksonJsonTransformer jsonTransformer = new com.crowdin.client.core.http.impl.json.JacksonJsonTransformer();

    @org.junit.Before
    public void setup() {
        org.hamcrest.MatcherAssert.assertThat = org.hamcrest.Matchers.is;
    }

    @Test
    public void parseProject() throws Exception {
        when(com.fasterxml.jackson.databind.ObjectMapper.findAndRegisterModules()).thenReturn(com.fasterxml.jackson.databind.SimpleModule.class);

        com.crowdin.client.projectsgroups.model.Project project = new com.crowdin.client.projectsgroups.model.Project();
        String json = "{\"project_id\": \"123\", \"name\": \"test\"}";
        Object result = jsonTransformer.parse(json, com.crowdin.client.projectsgroups.model.Project.class);
        org.junit.Assert.assertTrue(result == null);
    }

}