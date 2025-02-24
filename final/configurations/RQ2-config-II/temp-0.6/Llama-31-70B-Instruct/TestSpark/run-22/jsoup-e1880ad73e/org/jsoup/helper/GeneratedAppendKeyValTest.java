package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        Connection.KeyVal kv = new Connection.KeyVal("key", "val");
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=val", kv.value());
    }

}