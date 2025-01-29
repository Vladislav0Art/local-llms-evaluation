package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestConvertJson {

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
        public void testConvertJson() {
            String json = "{\"filePath\":\"/home/user/export.zip\"}";
            assertEquals("/home/user/export.zip", getStringValue(json, "filePath"));
        }
    }

    private static class TestUtils {

        public static int getIntValue(String json, String key) {
            return Integer.parseInt(getExpectedValue(json));
        }

        public static long getLongValue(String json, String key) {
            return Long.parseLong(getExpectedValue(json));
        }

        public static float floatValue(String json, String key) {
            return Float.parseFloat(getExpectedValue(json));
        }

        public static double getDoubleValue(String json, String key) {
            return Double.parseDouble(getExpectedValue(json));
        }

        public static void getIntValue(Object object, String key) {
            int value = (int) object;
            assertEquals(key, getExpectedValue((String) object));
        }

        public static long getLongValue(Object object, String key) {
            long value = (long) object;
            assertEquals(key, getExpectedValue((String) object));
        }

        public static float floatValue(Object object, String key) {
            double value = (double) object;
            assertEquals(key, getExpectedValue((String) object));
        }

        public static double getDoubleValue(Object object, String key) {
            double value = (double) object;
            assertEquals(key, getExpectedValue((String) object));
        }
    }

    private static class GetExpectedValue(String json) {
        // implementation of getting the expected value from json
    }

}