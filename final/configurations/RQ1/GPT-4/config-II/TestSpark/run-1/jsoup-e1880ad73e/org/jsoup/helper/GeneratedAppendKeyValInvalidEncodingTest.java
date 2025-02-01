package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValInvalidEncodingTest {

    @Test
    public void appendKeyValInvalidEncodingTest() throws Exception {
        URL url = new URL("http://test.com:8080/temp/index.html");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = Connection.KeyVal.create(new String(new byte[]{(byte) 0xC3, (byte) 0x28}), "value");

        urlBuilder.appendKeyVal(kv);
    }

}