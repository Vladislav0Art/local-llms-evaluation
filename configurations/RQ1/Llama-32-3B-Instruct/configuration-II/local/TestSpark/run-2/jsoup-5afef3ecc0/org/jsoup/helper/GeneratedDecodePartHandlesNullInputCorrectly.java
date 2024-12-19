package org.jsoup.helper;

public class GeneratedDecodePartHandlesNullInputCorrectly {

    @Test
    public void decodePartHandlesNullInputCorrectly() throws UnsupportedEncodingException, URISyntaxException {
        String encoded = "http://example.com/path";
        assertEquals("http://example.com/path", UrlBuilder.decodePart(encoded));
    }

}