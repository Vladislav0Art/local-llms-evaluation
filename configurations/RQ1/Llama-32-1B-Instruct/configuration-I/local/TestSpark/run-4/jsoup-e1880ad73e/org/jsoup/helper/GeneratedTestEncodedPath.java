package org.jsoup.helper;

public class GeneratedTestEncodedPath {

    @Test
    public void testEncodedPath() {
        final String url = "https://example.com/path?a=1&b=2";
        final URLBuilder builder = new UrlBuilder(new URL(url));
        assert builder.u == new URL("https://example.com/path?%3Aa%3D1&%3Ab%3D2");
        assert null == builder.q;
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/path?%3Aa%3D1%26%3Ab%3D2", normalizedUrl);
    }

}