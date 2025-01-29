package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestAppendKeyVal_Url {

    @Test
    public void testAppendKeyVal_Url() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal(key, value));
        String result = DataUtil.toString(builder.build(), UTF_8);
        assertEquals("https://example.com/path/to/resource?key=value", result);
    }

}