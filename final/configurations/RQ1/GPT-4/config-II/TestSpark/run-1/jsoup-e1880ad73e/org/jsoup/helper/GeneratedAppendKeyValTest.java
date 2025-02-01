package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://test.com:8080/temp/index.html");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");

        urlBuilder.appendKeyVal(kv);

        URL result = urlBuilder.build();

        assertEquals(new URL("http://test.com:8080/temp/index.html?key=value"), result);
    }

}