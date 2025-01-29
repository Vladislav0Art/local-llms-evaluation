package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.StringUtil;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_NullKv {

    @Test
    public void testAppendKeyVal_NullKv() throws UnsupportedEncodingException {
        KeyVal kv = null;
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}