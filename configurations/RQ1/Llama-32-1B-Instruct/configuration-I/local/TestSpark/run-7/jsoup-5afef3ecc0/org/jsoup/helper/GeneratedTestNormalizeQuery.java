package org.jsoup.helper;

public class GeneratedTestNormalizeQuery {

    @Test
    public void testNormalizeQuery() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path?query=value&ref=reference"));
        assertEquals("https%3Aexample.com%2Fpath?key=value&ref%3Areference", builder.build().toString());
    }

}