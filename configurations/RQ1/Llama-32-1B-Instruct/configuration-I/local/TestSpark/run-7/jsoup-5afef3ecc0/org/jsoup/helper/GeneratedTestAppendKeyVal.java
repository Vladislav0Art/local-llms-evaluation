package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path?query=value&ref=reference"));
        assertEquals("https%3Aexample.com%2Fpath?key%3Abig%20value%26ref%3Arigid%20reference", builder.build().toString());
    }

}