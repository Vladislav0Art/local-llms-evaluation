package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilderTestUtils;
import org.jsoup.matcher.KeyMatcher;
import org.junit.Test;

public class GeneratedTestAppendKeyVal {

    private final UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));

    @Test
    public void testAppendKeyVal() {
        KeyMatcher keyMatcher = KeyMatcher.stringToKey("param1=value1");
        String input = "param1=value1";
        String expected = "param1=value1";
        urlBuilder.appendKeyVal(keyMatcher, input);
        assertEquals(expected, DataUtil.decode(input));
    }

}