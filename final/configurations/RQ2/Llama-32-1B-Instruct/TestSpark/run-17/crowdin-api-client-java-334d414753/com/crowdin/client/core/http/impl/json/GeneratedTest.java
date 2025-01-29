package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTest {

    public ObjectMapper objectMapper = new ObjectMapper();
    public Project project;
    public FileInfo fileInfo;
    public ImportOptions importOptions;

    @Before
    public void setup() {
        objectMapper.registerModule(new SimpleModule());
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        objectMapper.enable(DeserializationFeature.FAIL_ON_missing_dates);

        project = new Project();
        fileInfo = new FileInfo();
        importOptions = new ImportOptions();

        // Mocking not used in this test
    }

    @Test
    public void [MethodUnderTest]

    ParseJsonConvertsToStringTest() throws Exception {
        String json = "[\"string\"]";
        Class<?> clazz = String.class;

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.parse(json, clazz);
        assertEquals("string", transformer.convert(actual));
    }

    @Test
    public void [MethodUnderTest]

    ConvertToStringParseJsonTest() throws Exception {
        String json = "\"hello\"";
        Class<?> clazz = String.class;

        ObjectMapper objectMapper2 = new ObjectMapper();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.parse(json, clazz);
        assertEquals("hello", (String) objectToValue(actual, clazz));
    }

    @Test
    public void [MethodUnderTest]

    ConvertToStringParseJsonArrayTest() throws Exception {
        String json = "[\"apple\"]";
        Class<?> clazz = String.class;

        ObjectMapper objectMapper2 = new ObjectMapper();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.parse(json, clazz);
        assertEquals("apple", (String) objectToValue(actual, clazz));
    }

    @Test
    public void [MethodUnderTest]

    ConvertFromStringParseJsonTest() throws Exception {
        String json = "hello";
        Class<?> clazz = String.class;

        ObjectMapper objectMapper2 = new ObjectMapper();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.convert(json, clazz);
        assertEquals("hello", (String) objectToValue(actual, clazz));
    }

    @Test
    public void [MethodUnderTest]

    ConvertFromStringParseJsonArrayTest() throws Exception {
        String json = "apple";
        Class<?> clazz = String.class;

        ObjectMapper objectMapper2 = new ObjectMapper();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.convert(json, clazz);
        assertEquals("apple", (String) objectToValue(actual, clazz));
    }

    private <T> T objectToValue(Object value, Class<T> clazz) {
        if (value instanceof String) {
            return ((String) value).trim().toLowerCase();
        } else if (clazz == Integer.class || clazz == Long.class || clazz == Double.class) {
            return value;
        } else {
            throw new UnsupportedOperationException("Unsupported type: " + value.getClass());
        }
    }

    @Test
    public void [MethodUnderTest]

    ConvertFromStringObjectParseJsonTest() throws Exception {
        String json = "{ \"name\": \"John\" }";
        Class<?> clazz = Object.class;

        ObjectMapper objectMapper2 = new ObjectMapper();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.convert(json, clazz);
        assertEquals("John", (String) objectToValue(actual, clazz));
    }

}