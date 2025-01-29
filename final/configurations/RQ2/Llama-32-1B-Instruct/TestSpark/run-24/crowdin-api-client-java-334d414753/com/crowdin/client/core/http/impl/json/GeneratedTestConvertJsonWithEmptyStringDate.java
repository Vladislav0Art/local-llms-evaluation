package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestConvertJsonWithEmptyStringDate {

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

}