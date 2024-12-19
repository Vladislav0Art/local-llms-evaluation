package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestJsonParsingWithNonNullString {

    @BeforeEach
    public void setup() {
        JsonTransformer.mockObj(JsonTransformer::parse).withAnyArguments();
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

}