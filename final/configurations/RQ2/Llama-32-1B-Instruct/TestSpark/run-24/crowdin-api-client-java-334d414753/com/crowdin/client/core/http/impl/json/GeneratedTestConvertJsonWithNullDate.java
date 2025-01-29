package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestConvertJsonWithNullDate {

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

}