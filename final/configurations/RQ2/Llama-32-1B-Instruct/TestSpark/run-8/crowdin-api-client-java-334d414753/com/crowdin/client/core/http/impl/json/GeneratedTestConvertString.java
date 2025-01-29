package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertString {

    @Test
    public void testConvertString() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        String result = "{\"key\":\"value\"}";

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object resultObject = transformer.convert(result);

        // Assert
        assertEquals(json, (String) resultObject);
    }

}