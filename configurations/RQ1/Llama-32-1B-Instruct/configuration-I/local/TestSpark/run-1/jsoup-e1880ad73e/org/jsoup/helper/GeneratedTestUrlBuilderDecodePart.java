package org.jsoup.helper;

public class GeneratedTestUrlBuilderDecodePart {

    @Test
    public void testUrlBuilderDecodePart() {
        String encoded = "example.com/path/to/resource?key=value&foo=bar";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(encoded));
        assert urlBuilder.decodePart(encoded).equals("example.com/path/to/resource");
    }

}