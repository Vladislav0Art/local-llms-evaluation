package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilderTestUtils;
import org.jsoup.matcher.KeyMatcher;
import org.junit.Test;

public class GeneratedTestAppendKeyValNull {

    private final UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));

    @Test
    public void testAppendKeyValNull() {
        KeyMatcher keyMatcher = KeyMatcher.stringToKey("param1=value1");
        String input = null;
        urlBuilder.appendKeyVal(keyMatcher, input);
        assertTrue(urlBuilder.build().isEmpty());
    }

}