package org.jsoup.helper;

public class GeneratedBuildUrlWithQueryAndFragmentReturnsCorrectNormalizedUrl {

    @Test
    public void buildUrlWithQueryAndFragmentReturnsCorrectNormalizedUrl() {
        // given
        String protocol = "http";
        String host = "example.com";
        int port = 80;
        URL inputUrl = new URL(protocol, "", host, port, "/path?query=value#fragment", null);

        // when
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL normalizedUrl = builder.build();

        // then
        assertEquals(protocol, normalizedUrl.getProtocol());
        assertEquals(host, IDN.toASCII(decodePart(normalizedUrl.getHost())));
        assertTrue(normalizedUrl.getPath().contains("/path"));
        assertTrue(normalizedUrl.getQuery().equals("query=value"));
        assertTrue(normalizedUrl.getRef().equals("fragment"));
    }

}