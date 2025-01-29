package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertNull {

    @Test
    public void testConvertNull() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object obj = null;

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.convert(obj));
    }

}