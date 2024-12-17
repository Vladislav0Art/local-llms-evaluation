package org.jsoup.helper;

public class GeneratedDecodePartNormalString {

    @Test
    public void decodePartNormalString() {
        String encoded = "test";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("test", decoded);
    }

}