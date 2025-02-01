package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.jsoup.Connection.KeyVal.create;
import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValWithUnsupportedEncodingTest {

    @Test
    public void appendKeyValWithUnsupportedEncodingTest() throws Exception {
        URL url = new URL("https://www.example.com/?key1=val1");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = create("kéy2", "vål2"); //Key and value that can't be encoded in UTF-8
        urlBuilder.appendKeyVal(kv);
        urlBuilder.build();
    }

}