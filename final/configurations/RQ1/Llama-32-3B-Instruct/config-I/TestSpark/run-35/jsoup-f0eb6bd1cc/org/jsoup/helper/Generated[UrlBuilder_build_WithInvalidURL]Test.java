package org.jsoup.helper;

public class Generated[UrlBuilder_build_WithInvalidURL]

Test {

    @Test
    public void [UrlBuilder_build_WithInvalidURL]Test() throws MalformedURLException, URISyntaxException {
        URL u = new URL("invalid://example.com");
        UrlBuilder ub = new UrlBuilder(u);
        assert ub.u == null;
    }

}