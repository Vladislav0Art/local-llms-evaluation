package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_noFragment {

    @Test
    public void testAppendKeyVal_noFragment() {
        String key = "value";
        String url = "http://example.com?key=value&other=1";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal().key(key).value("test"));
        assertEquals("http://example.com?value=test", builder.build().toString());
    }

}