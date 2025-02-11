package org.jsoup.helper;

public class Generated[UrlBuilder_build]

Test {

    @Test
    public void [UrlBuilder_build]Test() throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://example.com/path?query#fragment");
        UrlBuilder ub = new UrlBuilder(u);
        URL expectedUrl = new URL("http://example.com/path", "UTF-8", "?query", null, null);
        assertEquals(expectedUrl, ub.build());
    }

}