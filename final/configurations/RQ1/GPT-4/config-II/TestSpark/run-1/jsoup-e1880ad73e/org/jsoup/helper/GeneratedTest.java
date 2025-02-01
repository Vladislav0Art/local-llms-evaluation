package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://test.com:8080/temp/index.html?param=value#section");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL result = urlBuilder.build();

        assertNotNull(result);
        assertEquals(new URL("http://test.com:8080/temp/index.html?param=value#section"), result);
    }

    @Test
    public void buildInvalidProtocolTest() throws Exception {
        URL url = new URL("ht://test.com:8080/temp/index.html?param=value#section");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://test.com:8080/temp/index.html");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");

        urlBuilder.appendKeyVal(kv);

        URL result = urlBuilder.build();

        assertEquals(new URL("http://test.com:8080/temp/index.html?key=value"), result);
    }

    @Test
    public void appendKeyValInvalidEncodingTest() throws Exception {
        URL url = new URL("http://test.com:8080/temp/index.html");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = Connection.KeyVal.create(new String(new byte[]{(byte) 0xC3, (byte) 0x28}), "value");

        urlBuilder.appendKeyVal(kv);
    }

}