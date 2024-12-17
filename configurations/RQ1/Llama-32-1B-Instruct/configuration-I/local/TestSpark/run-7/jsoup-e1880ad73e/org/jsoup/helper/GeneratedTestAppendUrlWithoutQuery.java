package org.jsoup.helper;

public class GeneratedTestAppendUrlWithoutQuery {

    @Test
    public void testAppendUrlWithoutQuery() {
        String query = "foo=bar";
        String actualUrl = new UrlBuilder(new URL("https://example.com/path")).build();
        assertSame(URI.class, actualUrl.getProtocol());
        assertNotSame(query, null);
    }

}