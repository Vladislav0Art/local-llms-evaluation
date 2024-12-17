package org.jsoup.helper;

public class GeneratedTestAppendKeyValEmpty {

    @Test
    public void testAppendKeyValEmpty() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path?query=value"));
        assertEquals("https%3Aexample.com%2Fpath", builder.build().toString());
    }

}