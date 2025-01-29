package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTestAppendKeyVal {

    private static UrlBuilder urlBuilder = new UrlBuilder();

    @Test
    public void testAppendKeyVal() throws Exception {
        String[] kvArray = {"key1", "value1"};
        assertEquals("key1=value1", urlBuilder.appendKeyVal(kvArray));
    }

}