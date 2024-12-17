package org.jsoup.helper;

public class GeneratedTestNormalUrl {

    @Test
    public void testNormalUrl() {
        final String url = "https://example.com/path?a=1&b=2";
        final URLBuilder builder = new UrlBuilder(new URL(url));
        assert builder.u == new URL("https://example.com/path");
        assert null == builder.q;
        builder.appendKeyVal(new KeyVal("a", "1"));
        builder.appendKeyVal(new KeyVal("b", "2"));
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?a%3D1&b%3D2", normalizedUrl);
    }

}