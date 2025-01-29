package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_KeyValuesWithDifferentTypes {

    @Test
    public void testAppendKeyVal_KeyValuesWithDifferentTypes() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(inputUrl).appendKeyVal(new KeyVal("int_key", 123));
        assertEquals(sb.toString(), "int_key=123");
    }

}