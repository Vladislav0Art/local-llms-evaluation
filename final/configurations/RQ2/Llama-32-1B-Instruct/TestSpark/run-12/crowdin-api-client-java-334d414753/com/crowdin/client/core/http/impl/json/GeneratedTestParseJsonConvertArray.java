package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseJsonConvertArray {

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
    public void testParseJsonConvertArray() {
        String jsonArrStr = "[{\"id\":1,\"name\":\"John Doe\"},{\"id\":2,\"name\":\"Jane Doe\"}]";
        Project[] projects = (Project[]) objectMapper.readValue(jsonArrStr, Project[].class);
        assertEquals(2, projects.length);
        for (Project project : projects) {
            assertEquals("John Doe", project.getName());
            assertEquals(30, project.getAge());
        }
    }

}