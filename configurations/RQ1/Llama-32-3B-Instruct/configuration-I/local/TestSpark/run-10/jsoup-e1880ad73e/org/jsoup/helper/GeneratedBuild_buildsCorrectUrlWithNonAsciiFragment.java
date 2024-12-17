package org.jsoup.helper;

public class GeneratedBuild_buildsCorrectUrlWithNonAsciiFragment {

    @Test
    public void build_buildsCorrectUrlWithNonAsciiFragment() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL u = new URL("https://example.com#ä");
        UrlBuilder builder = new UrlBuilder(u);
        URI uri = new URI(builder.u.getProtocol(), builder.u.getUserInfo(), IDN.toASCII(decodePart(builder.u.getHost())), builder.u.getPort(), decodePart(builder.u.getPath()), null, "ä");
        assertEquals("https://example.com#ä", uri.toASCIIString());
    }

}