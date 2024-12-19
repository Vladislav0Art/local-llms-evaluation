package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestJsonConversionWithNonNullObject {

    @BeforeEach
    public void setup() {
        JsonTransformer.mockObj(JsonTransformer::parse).withAnyArguments();
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