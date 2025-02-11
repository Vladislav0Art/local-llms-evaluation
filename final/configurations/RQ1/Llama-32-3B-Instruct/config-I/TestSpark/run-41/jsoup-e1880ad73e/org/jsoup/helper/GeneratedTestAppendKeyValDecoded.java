package org.jsoup.helper;

public class GeneratedTestAppendKeyValDecoded {

    @Test
    public void testAppendKeyValDecoded() {
        UrlBuilder builder = new UrlBuilder();
        builder.append("k1", "v1");
        builder.append("k2", "v2%20x3");

        assertEquals("?k1=v1&k2=v2+x3", builder.q.toString());
    }

}