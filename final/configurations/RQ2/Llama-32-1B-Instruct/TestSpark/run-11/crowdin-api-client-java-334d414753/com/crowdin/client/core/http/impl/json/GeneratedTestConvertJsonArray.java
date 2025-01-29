package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertJsonArray {

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
    public void testConvertJsonArray() {
        String json = "[\"John\", \"Alice\"]";
        Object[] array = objectMapper.readValue(json, Object[].class);

        String result = transformerImpl.convert(json);
        assertNotNull(result);
        assertEquals(array, result);
    }

}