package org.jsoup.helper;

public class Generated[UrlBuilderDecodePart][InputInvalidString]

Test {

    @Test
    public void [UrlBuilderDecodePart][InputInvalidString]Test() throws UnsupportedEncodingException {
        String encoded = "%C3%A9x%20ample";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("%e0%80%e8x%20amp%20le", decoded);
    }

}