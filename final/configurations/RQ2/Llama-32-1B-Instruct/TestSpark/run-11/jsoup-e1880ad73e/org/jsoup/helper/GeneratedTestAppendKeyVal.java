package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        String expectedUrl = "http://example.com?key=value";
        assertEquals(expectedUrl, urlBuilder.build());
    }

}