package org.jsoup.helper;

public class GeneratedTestBuildWithRef {

    @Test
    public void testBuildWithRef() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource#anchor");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}