package org.jsoup.helper;

public class GeneratedBuildUrlWithValidProtocolAndHostReturnsCorrectUrl {

    @Test
    public void buildUrlWithValidProtocolAndHostReturnsCorrectUrl() {
        // given
        String protocol = "http";
        String host = "example.com";
        int port = 80;
        URL inputUrl = new URL(protocol, "", host, port, null, null);

        // when
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL normalizedUrl = builder.build();

        // then
        assertEquals(protocol, normalizedUrl.getProtocol());
        assertEquals(host, IDN.toASCII(decodePart(normalizedUrl.getHost())));
    }

}