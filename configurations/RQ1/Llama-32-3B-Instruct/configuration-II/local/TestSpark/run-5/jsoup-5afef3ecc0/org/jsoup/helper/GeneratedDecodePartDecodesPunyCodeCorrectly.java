package org.jsoup.helper;

public class GeneratedDecodePartDecodesPunyCodeCorrectly {

    @Test
    public void decodePartDecodesPunyCodeCorrectly() {
        String encodedHost = "http.";
        String decodedHost = UrlBuilder.decodePart(encodedHost);
        assertEquals("http.", decodedHost, "should not be puny-coded");
    }

}