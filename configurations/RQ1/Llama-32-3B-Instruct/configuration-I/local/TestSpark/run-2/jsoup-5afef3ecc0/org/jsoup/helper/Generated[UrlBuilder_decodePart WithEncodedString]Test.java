package org.jsoup.helper;

public class Generated[
UrlBuilder_decodePart WithEncodedString]

Test {

    @Test
    public void [UrlBuilder_decodePart WithEncodedString]Test() throws UnsupportedEncodingException {
        String encoded = "%40example.com";
        assertEquals("40@example.com", decodePart(encoded));
    }

}