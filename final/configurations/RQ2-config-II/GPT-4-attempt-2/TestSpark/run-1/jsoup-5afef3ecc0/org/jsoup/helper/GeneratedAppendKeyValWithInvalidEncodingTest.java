package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithInvalidEncodingTest {

    @Test
    public void appendKeyValWithInvalidEncodingTest() throws UnsupportedEncodingException {
        URL validURL = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(validURL);
        Connection.KeyVal kv = Connection.KeyVal.create("kěŷ", "vǎlũě");

        urlBuilder.appendKeyVal(kv);
    }

}