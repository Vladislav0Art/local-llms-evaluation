package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithoutQuery {

    private final String inputUrl = "https://example.com/path?query=abc#fragment";

    @Test
    public void testAppendKeyVal_WithoutQuery() {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"));
        assertEquals(inputUrl, builder.build().toASCIIString());
    }

}