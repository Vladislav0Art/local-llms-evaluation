package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValMultipleValidTest {

    @Test
    public void appendKeyValMultipleValidTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal1 = Connection.KeyVal.create("key1", "value1");
        Connection.KeyVal keyVal2 = Connection.KeyVal.create("key2", "value2");
        urlBuilder.appendKeyVal(keyVal1);
        urlBuilder.appendKeyVal(keyVal2);
        assertEquals("key1=value1&key2=value2", urlBuilder.q.toString());
    }

}