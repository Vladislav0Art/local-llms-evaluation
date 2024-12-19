package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestStringConversion {

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

}