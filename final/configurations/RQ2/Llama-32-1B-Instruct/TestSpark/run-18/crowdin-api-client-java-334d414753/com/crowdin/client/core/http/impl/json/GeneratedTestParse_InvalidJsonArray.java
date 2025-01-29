package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestParse_InvalidJsonArray {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testParse_InvalidJsonArray() {
        String json = "[{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}]";
        Object[] objects = parse(json, Object.class);
        Project[] projects = (Project[]) objects;
        // Check if the conversion fails
    }

}