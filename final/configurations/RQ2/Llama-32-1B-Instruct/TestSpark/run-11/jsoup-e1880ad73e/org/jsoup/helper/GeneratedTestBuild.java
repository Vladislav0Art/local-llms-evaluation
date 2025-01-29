package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.StringUtil;

import static org.junit.Assert.*;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        URL url = new URL("http://example.com");
        String expectedUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(expectedUrl, urlBuilder.build());
    }

}