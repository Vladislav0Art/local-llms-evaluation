package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedBuildTest_invalidURL {

    @Test
    public void buildTest_invalidURL() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("invalid url"));
        URL url = urlBuilder.build();
    }

}