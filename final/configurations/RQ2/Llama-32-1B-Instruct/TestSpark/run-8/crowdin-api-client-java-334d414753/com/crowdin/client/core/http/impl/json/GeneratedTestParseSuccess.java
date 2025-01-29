package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseSuccess {

    @Test
    public void testParseSuccess() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Project project = new Project();
        ExportOptions exportOptions = new ExportOptions();

        // Act
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object result = transformer.parse(json, project.getClass());

        // Assert
        assertEquals(project, (Object) result);
    }

}