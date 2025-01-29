package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertNullObjectArray {

    @Test
    public void testConvertNullObjectArray() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object[] arrayObj = null;
        Object obj = new Object[]{arrayObj};

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.convert(obj));
    }

}