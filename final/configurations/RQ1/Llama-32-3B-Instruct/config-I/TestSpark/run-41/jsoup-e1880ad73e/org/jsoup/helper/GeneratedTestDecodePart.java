package org.jsoup.helper;

public class GeneratedTestDecodePart {

    @Test
    public void testDecodePart() {
        UrlBuilder builder = new UrlBuilder();
        builder.decode("a%20b");
        assertEquals("ab", builder.result);
    }

}