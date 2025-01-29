package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestBuildUrlsWithMultipleQueries {

    @Test
    public void testBuildUrlsWithMultipleQueries() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        URLBuilder secondUrlBuilder = new UrlBuilder("http://example.com?param1=value1&param2=value2");
        assertEquals(new URI("http://example.com?param1=value1&param2=value2"), urlBuilder.build());
    }

}