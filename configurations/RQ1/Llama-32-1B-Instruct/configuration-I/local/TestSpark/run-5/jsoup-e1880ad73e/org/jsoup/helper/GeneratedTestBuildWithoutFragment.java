package org.jsoup.helper;

public class GeneratedTestBuildWithoutFragment {

    @Test
    public void testBuildWithoutFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}