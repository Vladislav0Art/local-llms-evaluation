package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertJsonWithEmptyString {

    @Test
    public void testConvertJsonWithEmptyString() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String date = "";

        try {
            transformer.convert(date, Date.class);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals(404, e.getMessage().indexOf("convert");
        }
    }

}