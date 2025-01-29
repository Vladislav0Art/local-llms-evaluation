package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTestBuild {

    private static UrlBuilder urlBuilder = new UrlBuilder();

    @Test
    public void testBuild() {
        URLBuilder.UrlBuilderTest(urlBuilder, "key1=value1", "key2=value2");
        assertEquals("https://www.example.com", urlBuilder.build().toString());
    }

}