package org.jsoup.helper;

public class Generated[UrlBuilderDecodePart][InputValidString]

Test {

    @Test
    public void [UrlBuilderDecodePart][InputValidString]Test() {
        String encoded = "http://example.com";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("http://example.com", decoded);
    }

}