package org.jsoup.helper;

public class GeneratedTestBuild {

    private String url;
    private UrlBuilder builder;

    @Test
    public void testBuild() {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2#anchor");
        builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertEquals("http://example.com/path?a%3D1&b%3D2#anchor", result.getScheme() + "://" + result.getHost());
    }

}