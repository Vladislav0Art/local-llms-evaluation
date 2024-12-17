package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_withFragment {

    @Test
    public void testAppendKeyVal_withFragment() {
        String key = "value";
        String url = "http://example.com?key=value#anchor&other=1";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal().key(key).value("test"));
        assertEquals("http://example.com?key=value#anchor?test=test", builder.build().toString());
    }

}