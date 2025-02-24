package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithInvalidUrlTest {

    private UrlBuilder builder;

    @Test
    public void buildWithInvalidUrlTest() {
        URL url = new URL("example.com");
        builder = new UrlBuilder(url);
        builder.build();
    }

}