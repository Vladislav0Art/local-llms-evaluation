package org.jsoup.helper;

public class GeneratedTestBuildWithoutEncoding {

    @Test
    public void testBuildWithoutEncoding() {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}