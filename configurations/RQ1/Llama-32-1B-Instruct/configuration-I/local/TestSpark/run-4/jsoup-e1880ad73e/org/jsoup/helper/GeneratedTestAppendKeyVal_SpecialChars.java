package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_SpecialChars {

    @Test
    public void testAppendKeyVal_SpecialChars() {
        final URLBuilder builder = new UrlBuilder(new URL("https://example.com/path?%20a=1"));
        assert builder.u == new URL("https://example.com/path?%20a%3D1");
        builder.appendKeyVal(new KeyVal("b", "2"));
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?%20a%3D1&b%3D2", normalizedUrl);
    }

}