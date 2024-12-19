package org.jsoup.helper;

public class GeneratedTestNormalUrl {

    @Test
    public void testNormalUrl() {
        URLBuilder urlBuilder = new URLBuilder(new URL("https://example.com/path"));
        assertSame(urlBuilder.u, new URL("https://example.com/path"));
    }

}