package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testParseJson() throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();

        String json = "{\"name\":\"John\",\"age\":30}";
        Project project = jsonMapper.readValue(json, Project.class);

        assertEquals(30, project.getAge());
    }

    @Test
    public void testConvertJsonWithNullDate() throws Exception {
        when(dateMapper.readValue(anyString(), Project.class)).thenReturn(null);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        try {
            transformer.convert(dateFormat, null);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals(404, e.getMessage().indexOf("convert"));
        }
    }

    @Test
    public void testConvertJsonWithEmptyStringDate() throws Exception {
        when(dateMapper.readValue(anyString(), Project.class)).thenReturn("");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        try {
            transformer.convert(dateFormat, "");
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals(404, e.getMessage().indexOf("convert"));
        }
    }

    @Test
    public void testConvertJsonWithNullDateObject() throws Exception {
        when(dateMapper.readValue(anyString(), Project.class)).thenReturn(null);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        try {
            transformer.convert(dateFormat, date);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals(404, e.getMessage().indexOf("convert"));
        }
    }

}