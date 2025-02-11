package org.jsoup.helper;

public class Generated[UrlBuilder_build_WithQuery]

Test {

    @Test
    public void [UrlBuilder_build_WithQuery]Test() throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://example.com/path?query#fragment");
        UrlBuilder ub = new UrlBuilder(u);
        URL expectedUrl = new URL("http://example.com/path?query", "UTF-8", "?query=encoded", null, null);
        assertEquals(expectedUrl, ub.build());
    }

}