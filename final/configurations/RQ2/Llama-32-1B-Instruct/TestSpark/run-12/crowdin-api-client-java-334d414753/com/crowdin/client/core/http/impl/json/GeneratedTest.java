package com.crowdin.client.core.http.impl.json;

public class GeneratedTest {

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

    @Test
    public void testConvertJsonToString() {
        String jsonStr = "{\"name\":\"John Doe\",\"age\":30}";
        String expectedStr = "{\"name\":\"John Doe\",\"age\":30}";
        assertEquals(expectedStr, objectMapper.writeValueAsString(jsonStr));
    }

    @Test
    public void testJacksonJsonTransformerNoMocking() throws Exception {
        JacksonJsonTransformerImpl transformer = new JacksonJsonTransformerImpl();
        String jsonStr = "{\"name\":\"John Doe\",\"age\":30}";
        Project project = transformer.parse(jsonStr, Project.class);
        assertEquals("John Doe", project.getName());
        assertEquals(30, project.getAge());
    }

}