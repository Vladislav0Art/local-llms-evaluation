package org.jsoup.helper;

public class GeneratedTestUrlBuilderEncodeNonAsciiPathComponents {

    @Test
    public void testUrlBuilderEncodeNonAsciiPathComponents() {
        String encoded = "example.com/path/to/resource?key=value&foo=bar";
        URL decodedURL = new URL(encoded);
        assertEquals("https://example.com/path%2Fto/resource?key=value&foo=bar", decodedURL.toString());
    }

}