package org.jsoup.helper;

public class GeneratedBuildUrlWithInvalidHostReturnsCorrectPunnedUrl {

    @Test
    public void buildUrlWithInvalidHostReturnsCorrectPunnedUrl() {
        // given
        String protocol = "http";
        String host = "%s.example.com";
        int port = 80;
        URL inputUrl = new URL(protocol, "", host, port, null, null);

        // when
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL normalizedUrl = builder.build();

        // then
        assertEquals(protocol, normalizedUrl.getProtocol());
        assertEquals("s.example.com", IDN.toASCII(decodePart(normalizedUrl.getHost())));
    }

}