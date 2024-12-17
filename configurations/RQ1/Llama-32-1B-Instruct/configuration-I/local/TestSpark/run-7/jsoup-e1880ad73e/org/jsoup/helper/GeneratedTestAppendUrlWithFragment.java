package org.jsoup.helper;

public class GeneratedTestAppendUrlWithFragment {

    @Test
    public void testAppendUrlWithFragment() {
        String fragment = "baz=qux";
        String actualUrl = new UrlBuilder(new URL("https://example.com/path?foo=bar#frag")).build();
        assertSame(URI.class, actualUrl.getProtocol());
        assertNotSame(fragment, null);
    }

}