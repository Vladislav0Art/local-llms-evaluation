package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);

        String expected = "http://www.example.com?key=value";
        String actual = urlBuilder.build().toString();

        assertEquals(expected, actual);
    }

}