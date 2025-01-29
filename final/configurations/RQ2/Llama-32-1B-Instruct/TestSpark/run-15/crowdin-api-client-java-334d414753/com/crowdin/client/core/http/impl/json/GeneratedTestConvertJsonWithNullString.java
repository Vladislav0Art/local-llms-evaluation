package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertJsonWithNullString {

    private ObjectMapper objectMapper = new ObjectMapper();

    @SneakyThrows
    public void testParseJson() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = objectMapper.readValue(json, Project.class);
        assertEquals(1, project.getNames().size());
        assertEquals(30, project.getAge());
    }

    @SneakyThrows
    public void testParseJsonWithNull() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\" null}";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = objectMapper.readValue(json, Project.class);
        assertEquals(1, project.getNames().size());
        assertEquals(30, project.getAge());
    }

    @SneakyThrows
    public void testConvertJson() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String convertedJson = transformer.convert(null);
        assertEquals(json, convertedJson);
    }

    @Test
    public void testConvertJsonWithNullString() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\" null}";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = objectMapper.readValue(json, Project.class);
        assertEquals(1, project.getNames().size());
        assertEquals(30, project.getAge());
    }

}