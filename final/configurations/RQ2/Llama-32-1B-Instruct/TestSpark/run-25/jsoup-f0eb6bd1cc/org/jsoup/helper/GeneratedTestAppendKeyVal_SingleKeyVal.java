package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_SingleKeyVal {

    @Test
    public void testAppendKeyVal_SingleKeyVal() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(inputUrl).appendKeyVal(new KeyVal("key", "value"));
        assertEquals(sb.toString(), "key=value");
    }

}