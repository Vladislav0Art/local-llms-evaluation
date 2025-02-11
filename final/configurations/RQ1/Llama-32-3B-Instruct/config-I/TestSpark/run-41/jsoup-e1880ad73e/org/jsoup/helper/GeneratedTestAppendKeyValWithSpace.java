package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithSpace {

    @Test
    public void testAppendKeyValWithSpace() {
        UrlBuilder builder = new UrlBuilder();
        builder.append("k1", "v1");
        builder.append("k2", "v2");

        assertEquals("?k1=v1+k2=v2", builder.q.toString());
    }

}