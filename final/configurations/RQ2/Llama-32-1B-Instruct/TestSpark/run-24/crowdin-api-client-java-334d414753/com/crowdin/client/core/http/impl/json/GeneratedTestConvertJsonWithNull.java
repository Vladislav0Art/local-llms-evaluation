package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertJsonWithNull {

    @Test
    public void testConvertJsonWithNull() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        try {
            transformer.convert(null, Date.class);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals(404, e.getMessage().indexOf("convert");
        }
    }

}