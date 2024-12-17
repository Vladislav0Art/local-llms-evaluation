package org.jsoup.helper;

public class GeneratedTestDecodePart {

    @Test
    public void testDecodePart() {
        String urlBuilder = new UrlBuilder();
        String encoded = "test";
        String expected = urlBuilder.decodePart(encoded);
        assertEquals(expected, "test");
    }

}