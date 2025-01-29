package com.crowdin.client.core.http.impl.json;

public class GeneratedTest {

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

    @Test
    public void testParseJsonArray() {
        String json = "[{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}, {\"name\":\"Alice\",\"age\":25}]";
        Object[] array = objectMapper.readValue(json, Object[].class);

        Object result = transformerImpl.parse(json, Object[].class);
        assertNotNull(result);
        assertEquals(array, result);
    }

    @Test
    public void testParseJsonObject() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        Project project = new Project();
        when(objectMapper.readValue(json, Project.class)).thenReturn(project);

        Object result = transformerImpl.parse(json, Project.class);
        assertNotNull(result);
        assertEquals(project, result);
    }

    @Test
    public void testParseJsonNull() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        try {
            transformerImpl.parse(json, Project.class);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testConvertJson() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        LanguageTranslations languageTranslations = new LanguageTranslations();
        languageTranslations.setName("English");
        when(objectMapper.writeValueAsString(json)).thenReturn("{'name':'John','age':30, 'city':'New York'}");

        String result = transformerImpl.convert(json);
        assertNotNull(result);
        assertEquals(json, result);
    }

    @Test
    public void testConvertJsonArray() {
        String json = "[\"John\", \"Alice\"]";
        Object[] array = objectMapper.readValue(json, Object[].class);

        String result = transformerImpl.convert(json);
        assertNotNull(result);
        assertEquals(array, result);
    }

    @Test
    public void testConvertJsonObject() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        Project project = new Project();
        when(objectMapper.writeValueAsString(project)).thenReturn("{'name':'John','age':30, 'city':'New York'}");

        String result = transformerImpl.convert(json);
        assertNotNull(result);
        assertEquals(project, result);
    }

    @Test
    public void testConvertJsonNull() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        try {
            transformerImpl.convert(json);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}