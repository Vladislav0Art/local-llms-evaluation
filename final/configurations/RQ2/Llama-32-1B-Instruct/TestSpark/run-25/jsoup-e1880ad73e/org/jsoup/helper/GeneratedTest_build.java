package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_build {

    @Test
    public void test_build() {
        String inputUrl = "http://example.com/path/to/resource";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();
        assertEquals(inputUrl, url.toString());
    }

}