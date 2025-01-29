package com.crowdin.client.core.http.impl.json;

public class GeneratedTestJacksonJsonTransformer {

    private ObjectMapper objectMapper = new ObjectMapper();

    @SneakyThrows
    public void testParseJsonConvertString() {
        String jsonStr = "{\"name\":\"John Doe\",\"age\":30}";
        Project project = objectMapper.readValue(jsonStr, Project.class);
        assertEquals("John Doe", project.getName());
        assertEquals(30, project.getAge());
    }

    @SneakyThrows
    public void testParseJsonConvertArray() {
        String jsonArrStr = "[{\"id\":1,\"name\":\"John Doe\"},{\"id\":2,\"name\":\"Jane Doe\"}]";
        Project[] projects = objectMapper.readValue(jsonArrStr, Project[].class);
        assertEquals(2, projects.length);
        for (Project project : projects) {
            assertEquals("John Doe", project.getName());
            assertEquals(30, project.getAge());
        }
    }

    @SneakyThrows
    public void testConvertJsonToString() {
        String jsonStr = "{\"name\":\"John Doe\",\"age\":30}";
        String expectedStr = "{\"name\":\"John Doe\",\"age\":30}";
        assertEquals(expectedStr, objectMapper.writeValueAsString(jsonStr));
    }

    @Test
    public void testJacksonJsonTransformer() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        // Use mock methods if needed
        String jsonStr = "{\"name\":\"John Doe\",\"age\":30}";
        Project project = transformer.parse(jsonStr, Project.class);
        assertEquals("John Doe", project.getName());
        assertEquals(30, project.getAge());
    }

}