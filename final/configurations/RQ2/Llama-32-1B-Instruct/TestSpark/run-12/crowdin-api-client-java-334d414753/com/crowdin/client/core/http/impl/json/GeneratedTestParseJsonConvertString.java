package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseJsonConvertString {

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
    public void testParseJsonConvertString() {
        String jsonStr = "{\"name\":\"John Doe\",\"age\":30}";
        Project project = (Project) objectMapper.readValue(jsonStr, Project.class);
        assertEquals("John Doe", project.getName());
        assertEquals(30, project.getAge());
    }

}