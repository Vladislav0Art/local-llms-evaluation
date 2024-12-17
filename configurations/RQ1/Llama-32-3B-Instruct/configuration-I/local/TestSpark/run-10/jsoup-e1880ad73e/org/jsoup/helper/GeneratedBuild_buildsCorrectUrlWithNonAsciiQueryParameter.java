package org.jsoup.helper;

public class GeneratedBuild_buildsCorrectUrlWithNonAsciiQueryParameter {

    @Test
    public void build_buildsCorrectUrlWithNonAsciiQueryParameter() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL u = new URL("https://example.com?ä=ö");
        UrlBuilder builder = new UrlBuilder(u);
        URI uri = new URI(builder.u.getProtocol(), builder.u.getUserInfo(), IDN.toASCII(decodePart(builder.u.getHost())), builder.u.getPort(), decodePart(builder.u.getPath()), "ä=ö", null);
        assertEquals("https://example.com?ä=ö", uri.toASCIIString());
    }

}