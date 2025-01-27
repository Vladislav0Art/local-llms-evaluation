package org.jsoup.helper;

public class GeneratedBuildMalformedUrl_MalformedUrl_test {

    @Test
    public void buildMalformedUrl_MalformedUrl_test() {
        UrlBuilder builder = new UrlBuilder(new URL("invalid://example.com/path/to/resource"));
        builder.build();
    }

}