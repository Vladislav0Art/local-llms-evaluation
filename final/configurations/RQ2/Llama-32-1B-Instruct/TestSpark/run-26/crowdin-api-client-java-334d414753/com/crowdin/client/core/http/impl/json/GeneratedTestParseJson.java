package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestParseJson {

    @BeforeAll
    public static void setUpClass() {
        // Remove mocking for now, leave it as is
    }

    @BeforeEach
    public void setup() throws Exception {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testParseJson() throws Exception {
        String json = "{\"name\":\"John\",\"age\":30}";
        Project project = objectMapper.readValue(json, Project.class);
        System.out.println(project.getName());
    }

}