package org.jsoup.helper;

public class GeneratedTestDecodePart {

    @Test
    public void testDecodePart() {
        String encoded = "key1%3Dvalue1%26key2%3Dvalue2";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("key1=value1&key2=value2", decoded);
    }

}