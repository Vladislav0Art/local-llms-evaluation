package org.jsoup.helper;

public class GeneratedTestBuildWithoutQuery {

    @Test
    public void testBuildWithoutQuery() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}