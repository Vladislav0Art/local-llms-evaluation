package org.jsoup.helper;

public class GeneratedTestBuild_3 {

    @Test
    public void testBuild_3() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com/path?param=value";
        URL decodedUrl = URLEncoder.encode(inputUrl, UTF_8).replaceAll("%3D", "=");
        UrlBuilder urlBuilder = new UrlBuilder(new URL(decodedUrl));
        assertEquals("http://example.com/path?param=value", urlBuilder.build().toString());
    }

}