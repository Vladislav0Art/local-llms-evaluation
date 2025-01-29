package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilderTestUtils;
import org.jsoup.matcher.KeyMatcher;
import org.junit.Test;

public class GeneratedTestAppendKeyValURINotMalformed {

    private final UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));

    @Test
    public void testAppendKeyValURINotMalformed() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com");
        KeyMatcher keyMatcher = KeyMatcher.stringToKey("param1=value1");
        String expected = "https://example.com?param1=value1";
        urlBuilder.appendKeyVal(keyMatcher, inputUrl);
        assertEquals(expected, DataUtil.encode(urlBuilder.build()));
    }

}