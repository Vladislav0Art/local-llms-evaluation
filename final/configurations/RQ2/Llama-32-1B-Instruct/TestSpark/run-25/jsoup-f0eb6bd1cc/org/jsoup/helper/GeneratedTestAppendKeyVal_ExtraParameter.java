package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_ExtraParameter {

    @Test
    public void testAppendKeyVal_ExtraParameter() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(inputUrl).appendKeyVal(new KeyVal("key1", "value1"));
        assertEquals(sb.toString(), "key1=value1");
    }

}