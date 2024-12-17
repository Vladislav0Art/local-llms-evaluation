package org.jsoup.helper;

public class GeneratedBuild_returnsUrlWithCorrectSchemeAndAuthority {

    @Test
    public void build_returnsUrlWithCorrectSchemeAndAuthority() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL u = new URL("https://example.com/ä", 8080);
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(builder.build(), new URL("https://example.com/ä", 8080));
    }

}