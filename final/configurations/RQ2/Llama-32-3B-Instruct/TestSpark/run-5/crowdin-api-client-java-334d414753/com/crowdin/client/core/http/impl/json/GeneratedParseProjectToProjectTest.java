package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseProjectToProjectTest {

    @Mock
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @Test
    public void parseProjectToProjectTest() {
        Project project = new Project();
        project.setId(1L);
        project.setName("Crowdin");
        String json = (String) com.fasterxml.jackson.databind.JsonNode.toJson(project);

        assertTrue(JsonTransformer.parse(json, Project.class) instanceof Project);
    }

}