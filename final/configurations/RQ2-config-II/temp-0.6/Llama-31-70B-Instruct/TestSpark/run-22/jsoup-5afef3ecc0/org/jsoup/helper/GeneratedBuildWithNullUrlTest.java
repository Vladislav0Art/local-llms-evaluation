package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithNullUrlTest {

    private UrlBuilder builder;

    @Test
    public void buildWithNullUrlTest() {
        URL url = null;
        builder = new UrlBuilder(url);
        builder.build();
    }

}