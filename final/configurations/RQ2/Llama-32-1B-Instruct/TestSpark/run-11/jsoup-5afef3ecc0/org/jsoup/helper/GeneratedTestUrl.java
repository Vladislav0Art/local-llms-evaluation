package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTestUrl {

    private static UrlBuilder urlBuilder = new UrlBuilder();

    @Test
    public void testUrl() {
        URLBuilder.UrlBuilderTest(urlBuilder, "key1=value1", "key2=value2");
        assertEquals("https://www.example.com", urlBuilder.build().toString());
    }

}