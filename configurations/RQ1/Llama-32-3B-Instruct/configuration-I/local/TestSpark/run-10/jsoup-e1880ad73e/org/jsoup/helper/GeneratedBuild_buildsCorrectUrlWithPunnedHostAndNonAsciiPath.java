package org.jsoup.helper;

public class GeneratedBuild_buildsCorrectUrlWithPunnedHostAndNonAsciiPath {

    @Test
    public void build_buildsCorrectUrlWithPunnedHostAndNonAsciiPath() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL u = new URL("https://example.com/ä", 8080);
        UrlBuilder builder = new UrlBuilder(u);
        URI uri = new URI(builder.u.getProtocol(), builder.u.getUserInfo(), IDN.toASCII(decodePart(builder.u.getHost())), builder.u.getPort(), decodePart(builder.u.getPath()), null, null);
        assertEquals("https://example.com/ä", uri.toASCIIString());
    }

}