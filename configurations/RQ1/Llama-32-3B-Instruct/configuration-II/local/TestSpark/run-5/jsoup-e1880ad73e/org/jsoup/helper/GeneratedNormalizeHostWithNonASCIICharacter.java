package org.jsoup.helper;

public class GeneratedNormalizeHostWithNonASCIICharacter {

    private UrlBuilder urlBuilder;

    @Test
    public void normalizeHostWithNonASCIICharacter() {
        URL url = new URL("http://éxámpLè@example.com/path?query=abc#fragment");
        urlBuilder = new UrlBuilder(url);
        String decodedHost = IDN.toASCII(decodePart(url.getHost()));
        assertEquals("example.com", decodedHost);
    }

}