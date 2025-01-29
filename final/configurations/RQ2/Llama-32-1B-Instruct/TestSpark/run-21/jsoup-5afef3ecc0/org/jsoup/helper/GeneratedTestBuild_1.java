package org.jsoup.helper;

public class GeneratedTestBuild_1 {

    @Test
    public void testBuild_1() {
        String inputUrl = "http://example.com/path?param=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        assertEquals("http://example.com/path?param=value", urlBuilder.build().toString());
    }

}