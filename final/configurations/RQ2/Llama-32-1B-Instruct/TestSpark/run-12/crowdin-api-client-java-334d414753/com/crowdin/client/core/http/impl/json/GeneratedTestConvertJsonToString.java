package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertJsonToString {

    @SneakyThrows
    public <T> T parse(String json, Class<T> clazz) {
        return objectMapper.readValue(json, clazz);
    }

    @SneakyThrows
    public String convert(T obj) {
        return objectMapper.writeValueAsString(obj);
    }
}

public class JacksonJsonTransformerTest {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testConvertJsonToString() {
        String jsonStr = "{\"name\":\"John Doe\",\"age\":30}";
        String expectedStr = "{\"name\":\"John Doe\",\"age\":30}";
        assertEquals(expectedStr, objectMapper.writeValueAsString(jsonStr));
    }

}