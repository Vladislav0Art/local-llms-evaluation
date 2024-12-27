package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValInvalidEncodingTest {

    @Test
    public void appendKeyValInvalidEncodingTest() throws Exception {
        URL url = new URL("http://www.someurl.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = new Connection.KeyVal("name", "value", 'u');

        urlBuilder.appendKeyVal(kv);
    }

}