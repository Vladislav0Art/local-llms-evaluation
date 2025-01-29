package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.StringUtil;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_SingleArgument_URIEncoded {

    @Test
    public void testAppendKeyVal_SingleArgument_URIEncoded() throws UnsupportedEncodingException {
        String encodedKv = "key=value";
        KeyVal kv = URLDecoder.decode(encodedKv, UTF_8);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com?key=%28value%29", urlBuilder.build());
    }

}