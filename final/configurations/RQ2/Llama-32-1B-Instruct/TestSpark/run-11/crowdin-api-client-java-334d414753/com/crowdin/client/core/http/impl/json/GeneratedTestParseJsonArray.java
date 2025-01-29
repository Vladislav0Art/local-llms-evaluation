package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseJsonArray {

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
    public void testParseJsonArray() {
        String json = "[{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}, {\"name\":\"Alice\",\"age\":25}]";
        Object[] array = objectMapper.readValue(json, Object[].class);

        Object result = transformerImpl.parse(json, Object[].class);
        assertNotNull(result);
        assertEquals(array, result);
    }

}