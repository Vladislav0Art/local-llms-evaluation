package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestAppendKeyVal_Failing {

    @Test
    public void testAppendKeyVal_Failing() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal(key, value));
        try {
            DataUtil.toString(builder.build(), UTF_8); // Expect an exception
        } catch (UnsupportedEncodingException e) {
            // Expecting this to be a JUnit assertion error
        }
    }

}