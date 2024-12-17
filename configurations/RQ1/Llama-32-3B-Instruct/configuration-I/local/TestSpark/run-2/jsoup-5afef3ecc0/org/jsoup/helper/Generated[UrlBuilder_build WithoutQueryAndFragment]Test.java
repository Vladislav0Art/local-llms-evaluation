package org.jsoup.helper;

public class Generated[
UrlBuilder_build WithoutQueryAndFragment]

Test {

    @Test
    public void [UrlBuilder_build WithoutQueryAndFragment]Test() throws MalformedURLException, URISyntaxException {
        URL u = new URL("https://example.com/path");
        UrlBuilder builder = new UrlBuilder(u);
        URI uri = new URI(
                u.getProtocol(),
                u.getUserInfo(),
                IDN.toASCII(decodePart(u.getHost())),
                u.getPort(),
                decodePart(u.getPath())
        );
        assertEquals(new URL(uri.toASCIIString()), builder.u);
    }

}