package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseNull {

    @Test
    public void testParseNull() {
        // Arrange
        String json = "{\"key\":\"value\"}";

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.parse(json, Project.class));
    }

}