package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertJsonObject {

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
    public void testConvertJsonObject() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        Project project = new Project();
        when(objectMapper.writeValueAsString(project)).thenReturn("{'name':'John','age':30, 'city':'New York'}");

        String result = transformerImpl.convert(json);
        assertNotNull(result);
        assertEquals(project, result);
    }

}