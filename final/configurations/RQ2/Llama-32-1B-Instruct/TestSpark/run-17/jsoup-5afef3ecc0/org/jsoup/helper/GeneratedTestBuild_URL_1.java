package org.jsoup.helper;

public class GeneratedTestBuild_URL_1 {

    private final UrlBuilder urlBuilder;
    private String inputUrl;

    @Test
    public void testBuild_URL_1() throws MalformedURLException, UnsupportedEncodingException {
        inputUrl = "https://example.com/path?key=value";
        URL result = urlBuilder.build();
        URI uri = new URI(result.toString());
        assertEquals("https://example.com/path", uri.toString());
    }

}