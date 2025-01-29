package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertSuccess {

    @Test
    public void testConvertSuccess() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object obj = new Object();

        // Act
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object result = transformer.convert(obj);

        // Assert
        assertEquals(json, (String) result);
    }

}