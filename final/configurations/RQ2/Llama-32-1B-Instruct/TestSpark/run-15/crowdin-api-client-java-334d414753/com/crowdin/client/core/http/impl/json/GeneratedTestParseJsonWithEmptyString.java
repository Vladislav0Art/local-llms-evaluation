package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestParseJsonWithEmptyString {

    @Test
    public void testParseJsonWithEmptyString() throws JsonProcessingException {
        String json = "";
        ObjectMapper objectMapper = new ObjectMapper();
        Project project = objectMapper.readValue(json, Project.class);
        assertEquals(0, project.getNames().size());
        assertEquals(30, project.getAge());
    }

}