package org.jsoup.helper;

public class Generated[
UrlBuilder_build WithQueryAndFragment]

Test {

    @Test
    public void [UrlBuilder_build WithQueryAndFragment]Test() throws MalformedURLException, URISyntaxException {
        URL url = new URL("https://example.com/path?query=value#ref");
        UrlBuilder builder = new UrlBuilder(url);
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