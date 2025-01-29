package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_KeyValuesWithNull {

    @Test
    public void testAppendKeyVal_KeyValuesWithNull() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(inputUrl).appendKeyVal(new KeyVal(null, "value"));
        assertEquals(sb.toString(), "null=value");
    }

}