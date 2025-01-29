package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestBuildUrlsWithMultipleQueriesAndSpecialCharactersUnescaped {

    @Test
    public void testBuildUrlsWithMultipleQueriesAndSpecialCharactersUnescaped() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com? param%3D1&value1=value2");
        assertEquals(new URI("http://example.com?param=1&value=1"), urlBuilder.build());
    }

}