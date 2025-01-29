package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertStringArray {

    @Test
    public void testConvertStringArray() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object[] arrayObj = new Object[0];

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object resultObject = transformer.convert(arrayObj);

        // Assert
        assertEquals(json, (String) resultObject);
    }

}