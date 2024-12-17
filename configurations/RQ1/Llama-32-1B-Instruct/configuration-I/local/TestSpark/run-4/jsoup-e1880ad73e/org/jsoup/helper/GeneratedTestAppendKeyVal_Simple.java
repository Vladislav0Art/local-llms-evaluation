package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Simple {

    @Test
    public void testAppendKeyVal_Simple() {
        final URLBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        assert builder.u == new URL("https://example.com/path");
        builder.appendKeyVal(new KeyVal("a", "1"));
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?a%3D1", normalizedUrl);
    }

}