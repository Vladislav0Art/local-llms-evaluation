package org.jsoup.helper;

public class Generated[UrlBuilder]

DecodePart_Test {

    @Test
    public void [UrlBuilder]DecodePart_Test() {
        String encoded = "áth";
        String expected = "áth";
        assertEquals(expected, UrlBuilder.decodePart(encoded));
    }

}