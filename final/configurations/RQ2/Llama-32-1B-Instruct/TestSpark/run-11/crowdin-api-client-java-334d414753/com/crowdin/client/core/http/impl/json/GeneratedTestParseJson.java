package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseJson {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    @SneakyThrows
    public <T> T parse(String json, Class<T> clazz) {
        return objectMapper.readValue(json, clazz);
    }

    @Override
    @SneakyThrows
    public String convert(T obj) {
        return objectMapper.writeValueAsString(obj);
    }
}

public class JacksonJsonTransformerTest {

    @Mock
    private ObjectMapper objectMapper;

    @InjectMocks
    private JacksonJsonTransformerImpl transformerImpl;

    private static final SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");

    @Test
    public void testParseJson() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        Project project = new Project();
        project.setName("John");
        project.setAge(30);
        project.setCity("New York");
        when(objectMapper.readValue(json, Project.class)).thenReturn(project);

        Object result = transformerImpl.parse(json, Project.class);
        assertNotNull(result);
        assertEquals(project, result);
    }

}