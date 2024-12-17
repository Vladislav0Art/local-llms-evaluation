package org.jsoup.helper;

public class GeneratedTestBuildWithEncoding {

    @Test
    public void testBuildWithEncoding() {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value&charset=utf-8");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}