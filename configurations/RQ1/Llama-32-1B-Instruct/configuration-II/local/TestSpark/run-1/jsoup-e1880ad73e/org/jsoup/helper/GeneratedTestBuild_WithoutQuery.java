package org.jsoup.helper;

public class GeneratedTestBuild_WithoutQuery {

    private final String inputUrl = "https://example.com/path?query=abc#fragment";

    @Test
    public void testBuild_WithoutQuery() {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(null, true);
        String expected = inputUrl;
        assertEquals(expected, builder.build().toASCIIString());
    }

}