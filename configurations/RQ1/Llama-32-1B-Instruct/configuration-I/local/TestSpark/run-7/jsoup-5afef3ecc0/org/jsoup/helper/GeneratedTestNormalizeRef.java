package org.jsoup.helper;

public class GeneratedTestNormalizeRef {

    @Test
    public void testNormalizeRef() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path#reference"));
        assertEquals("https%3Aexample.com%2Fpath#reference", builder.build().toString());
    }

}