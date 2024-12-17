package org.jsoup.helper;

public class GeneratedTestEncodingHostNonAsciiPathComponents {

    private UrlBuilder urlBuilder;

    @Test
    public void testEncodingHostNonAsciiPathComponents() throws MalformedURLException, URISyntaxException {
        String host = "HÃtÃ;
        String path = "/path";
        URI uri = new URI(host, null, IDN.toASCII(decodePart(host)), 8080, decodePart(path));
        assertEquals("http://HÃtÃ/path", uri.toASCIIString());
    }

}