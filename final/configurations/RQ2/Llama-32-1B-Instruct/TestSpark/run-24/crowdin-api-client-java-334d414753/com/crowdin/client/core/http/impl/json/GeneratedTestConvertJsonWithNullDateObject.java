package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestConvertJsonWithNullDateObject {

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