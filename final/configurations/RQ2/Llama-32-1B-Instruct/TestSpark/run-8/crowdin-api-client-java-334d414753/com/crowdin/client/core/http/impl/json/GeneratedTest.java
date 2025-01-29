package com.crowdin.client.core.http.impl.json;

public class GeneratedTest {

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

    @Test
    public void testParseNull() {
        // Arrange
        String json = "{\"key\":\"value\"}";

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.parse(json, Project.class));
    }

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

    @Test
    public void testConvertNull() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object obj = null;

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.convert(obj));
    }

    @Test
    public void testConvertNullObject() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object obj = new Object();

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.convert(obj));
    }

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

    @Test
    public void testConvertNullResult() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object obj = null;

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.convert(obj));
    }

    @Test
    public void testConvertStringArray() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object[] arrayObj = new Object[0];
        Object resultObject = new Object[]{arrayObj};

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object result = transformer.convert(resultObject);

        // Assert
        assertEquals(json, (String) result);
    }

    @Test
    public void testConvertNullResultArray() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object[] arrayObj = null;
        Object obj = new Object[]{arrayObj};

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.convert(obj));
    }

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

    @Test
    public void testConvertNullResultArray() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Object[] arrayObj = null;
        Object obj = new Object[]{arrayObj};

        // Act and Assert
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.convert(obj));
    }

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