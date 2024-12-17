package org.jsoup.helper;

public class GeneratedDecodePartEncodedString {

    @Test
    public void decodePartEncodedString() throws UnsupportedEncodingException {
        String encoded = "%20test";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals(" test ", decoded);
    }

}