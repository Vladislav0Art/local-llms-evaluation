package org.jsoup.helper;

public class Generated[UrlBuilder_decodePart]

Test {

    @Test
    public void [UrlBuilder_decodePart]Test() throws UnsupportedEncodingException {
        String encoded = "äöü";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("aöü", decoded);
    }

}