package org.jsoup.helper;

public class GeneratedTestBuildWithFragment {

    @Test
    public void testBuildWithFragment() {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource#anchor");
        try {
            builder.build();
            fail("Expected MalformedURLException to be thrown");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}