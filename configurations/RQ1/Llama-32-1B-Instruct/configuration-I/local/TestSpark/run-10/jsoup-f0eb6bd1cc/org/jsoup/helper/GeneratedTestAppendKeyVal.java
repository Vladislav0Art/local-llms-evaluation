package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        String key = "value";
        String url = "http://example.com?key=value&other=1#anchor";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal().key(key).value("test"));
        assertEquals("http://example.com?value=test", builder.build().toString());
    }

}