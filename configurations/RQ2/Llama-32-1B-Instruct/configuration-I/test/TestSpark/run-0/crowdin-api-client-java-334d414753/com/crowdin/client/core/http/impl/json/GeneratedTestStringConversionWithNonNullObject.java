package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestStringConversionWithNonNullObject {

    @BeforeEach
    public void setup() {
        JsonTransformer.mockObj(JsonTransformer::parse).withAnyArguments();
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

}