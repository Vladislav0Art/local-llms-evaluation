package org.jsoup.helper;

public class GeneratedDecodePartWithInvalidEncoding {

    private UrlBuilder urlBuilder;

    @Test
    public void decodePartWithInvalidEncoding() throws UnsupportedEncodingException {
        String encoded = "éxámpLè";
        assertEquals("exampleLè", decodePart(encoded));
    }

}