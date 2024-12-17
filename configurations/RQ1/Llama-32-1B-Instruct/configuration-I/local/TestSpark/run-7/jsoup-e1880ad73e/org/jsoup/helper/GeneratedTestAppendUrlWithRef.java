package org.jsoup.helper;

public class GeneratedTestAppendUrlWithRef {

    @Test
    public void testAppendUrlWithRef() {
        String ref = "quux";
        String actualUrl = new UrlBuilder(new URL("https://example.com/path?foo=bar#frag")).build();
        assertSame(URI.class, actualUrl.getProtocol());
        assertNotSame(ref, null);
    }

}