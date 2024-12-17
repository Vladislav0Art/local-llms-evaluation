package org.jsoup.helper;

public class GeneratedTestUrlBuilderEncodeEscapes {

    @Test
    public void testUrlBuilderEncodeEscapes() throws UnsupportedEncodingException {
        String encoded = "example.com/path/to/resource?key=value&foo=bar";
        URL decodedURL = new URL(encoded);
        assertEquals("https://example.com/path/to/resource", decodedURL.toString());
    }

}