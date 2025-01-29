package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_no_key_value {

    @Test
    public void testAppendKeyVal_no_key_value() throws UnsupportedEncodingException {
        String key = "key";
        UrlBuilder builder = new UrlBuilder(new URI(url));
        builder.appendKeyVal(null);
        assertEquals("", StringUtil.stripMargin(builder.build().toString()));
    }

}