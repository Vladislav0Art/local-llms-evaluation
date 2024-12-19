package org.jsoup.helper;

public class GeneratedTestUrlBuilder_build {

    @Test
    public void testUrlBuilder_build() {
        // Test case for build method
        String url = "https://example.com/path?query=value";
        URLBuilder builder = new URLBuilder(new URI(url));
        URL expectedUrl = new URI("https://example.com/path");
        assertEquals(expectedUrl, builder.build());
    }

}