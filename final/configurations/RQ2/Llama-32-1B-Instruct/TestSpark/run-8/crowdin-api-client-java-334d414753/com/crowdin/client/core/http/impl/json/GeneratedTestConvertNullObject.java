package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertNullObject {

    @Test
    public void testConvertNullObject() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object obj = new Object();

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.convert(obj));
    }

}