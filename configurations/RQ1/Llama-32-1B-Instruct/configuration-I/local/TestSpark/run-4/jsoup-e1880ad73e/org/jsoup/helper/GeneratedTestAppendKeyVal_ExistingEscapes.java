package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_ExistingEscapes {

    @Test
    public void testAppendKeyVal_ExistingEscapes() {
        final URLBuilder builder = new UrlBuilder(new URL("https://example.com/path? a=1 b=2"));
        assert builder.u == new URL("https://example.com/path? a%3D1&b%3D2");
        builder.appendKeyVal(new KeyVal("c", "3"));
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?a%3D1&b%3D2& c%3D3", normalizedUrl);
    }

}