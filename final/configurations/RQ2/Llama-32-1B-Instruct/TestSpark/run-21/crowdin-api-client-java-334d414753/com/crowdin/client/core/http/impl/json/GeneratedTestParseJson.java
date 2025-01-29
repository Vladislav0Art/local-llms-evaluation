package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestParseJson {

    @Override
    public <T> T parse(String json, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return (T) objectMapper.readValue(json, clazz);
        } catch (Exception e) {
            throw new JsonProcessingException(e.getMessage());
        }
    }

    @Override
    public <T> String convert(T obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private static class Test {

        @Test
        public void testParseJson() {
            String json = "{\"filePath\":\"/home/user/export.zip\"}";
            assertEquals("/home/user/export.zip", getStringValue(json, "filePath"));
        }

    }