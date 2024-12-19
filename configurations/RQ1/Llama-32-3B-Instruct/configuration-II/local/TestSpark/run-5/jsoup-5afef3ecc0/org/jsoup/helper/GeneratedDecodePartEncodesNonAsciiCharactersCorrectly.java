package org.jsoup.helper;

public class GeneratedDecodePartEncodesNonAsciiCharactersCorrectly {

    @Test
    public void decodePartEncodesNonAsciiCharactersCorrectly() {
        String encodedHost = "\u00E0";
        String decodedHost = UrlBuilder.decodePart(encodedHost);
        assertEquals("\u00e0", decodedHost, "should encode non-ascii characters correctly");
    }

}