package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.StringUtil;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_SingleArgument_Security {

    @Test
    public void testAppendKeyVal_SingleArgument_Security() throws UnsupportedEncodingException {
        String encodedKv = "key=value";
        KeyVal kv = URLDecoder.decode(encodedKv, UTF_8);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

}