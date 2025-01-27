package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParse JsonToProjectTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void parse

    JsonToProjectTest() {
        String json = "{\"name\":\"My Project\",\"groupId\":123,\"path\":\"/my/project\"}";
        Project project = objectMapper.readValue(json, Project.class);
        assertEquals("My Project", project.getName());
        assertEquals(123L, project.getGroupId());
        assertEquals("/my/project", project.getPath());
    }

}