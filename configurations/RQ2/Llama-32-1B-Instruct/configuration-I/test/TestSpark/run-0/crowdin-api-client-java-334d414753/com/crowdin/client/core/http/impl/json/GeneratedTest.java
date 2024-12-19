package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @BeforeEach
    public void setup() {
        JsonTransformer.mockObj(JsonTransformer::parse).withAnyArguments();
    }

    @Test
    public void testStringConversion() {
        String json = "{\"name\":\"John\"}";
        Object obj = JsonTransformer.parse(json, String.class);
        assertEquals("John", (String) obj);
    }
}

public class StringParseTest {

    private static class MockParse {
        @Mock
        public <T> T parse(String json, Class<T> clazz) throws Exception {
            return null;
        }
    }

    @Test
    public void testJsonParsingWithNonNullString() {
        StringConvertTest.StringConvertTestTest();
    }

    private void StringParseTestTest() {
        String json = "{\"name\":\"John\"}";
        MockParse mockParse = new MockParse();
        JsonTransformer instance = new JacksonJsonTransformer();
        Object obj = instance.parse(json, String.class);
        assertNotNull(obj);
        assertEquals("John", (String) obj);
    }
}

public class StringToJSONTest {

    private static class MockConvert {
        @Mock
        public <T> T convert(T obj) throws Exception {
            return null;
        }

        @Mock
        public Object parse(String json, Class<?> clazz) throws Exception {
            return null;
        }
    }

    @Test
    public void testJsonConversionWithNonNullObject() {
        StringConvertTest.StringConvertTest.testStringConversion();
    }

    private void StringToJSONTestTest() {
        String json = "{\"name\":\"John\"}";
        MockConvert mockConvert = new MockConvert();
        JsonTransformer instance = new JacksonJsonTransformer();
        Object obj = instance.parse(json, String.class);
        assertNotNull(obj);
        assertEquals("John", (String) obj);
    }
}

public class NonNullStringConvertTest {

    @Before
    public void setup() {
        JsonTransformer.mockObj(JsonTransformer::parse).withAnyArguments();
    }

    private static class MockParse {
        @Mock
        public <T> T parse(String json, Class<T> clazz) throws Exception {
            return null;
        }
    }

    @Test
    public void testStringConversionWithNonNullObject() {
        StringConvertTest.StringConvertTest.testStringConversion();
    }

    private void NonNullStringConvertTestTest() {
        String json = "{\"name\":\"John\"}";
        MockParse mockParse = new MockParse();
        JsonTransformer instance = new JacksonJsonTransformer();
        Object obj = instance.parse(json, String.class);
        assertNotNull(obj);
        assertEquals("John", (String) obj);
    }
}

public class StringParsingTest {

    @Before
    public void setup() {
        JsonTransformer.mockObj(JsonTransformer::parse).withAnyArguments();
    }

    private static class MockParse {
        @Mock
        public <T> T parse(String json, Class<T> clazz) throws Exception {
            return null;
        }
    }

    @Test
    public void testJsonConversionWithNonNullObject() {
        StringConvertTest.StringConvertTest.testStringConversion();
    }

    private void StringParsingTestTest() {
        String json = "{\"name\":\"John\"}";
        MockParse mockParse = new MockParse();
        JsonTransformer instance = new JacksonJsonTransformer();
        Object obj = instance.parse(json, String.class);
        assertNotNull(obj);
        assertEquals("John", (String) obj);
    }

}