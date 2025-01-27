package org.jsoup.helper;

public class GeneratedBuildUrl_MalformedUrl_test {

    @Test
    public void buildUrl_MalformedUrl_test() {
        UrlBuilder builder = new UrlBuilder(new URL("invalid://example.com/path/to/resource"));
        builder.build();
    }

}