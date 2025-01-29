package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertNullResult {

    @Test
    public void testConvertNullResult() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object obj = null;

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.convert(obj));
    }

}