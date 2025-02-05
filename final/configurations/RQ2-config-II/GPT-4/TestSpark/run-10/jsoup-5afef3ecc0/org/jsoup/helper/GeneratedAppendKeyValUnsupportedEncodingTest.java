package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL input = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(input);
        Connection.KeyVal kv = new Connection.KeyVal("key", "é");
        urlBuilder.appendKeyVal(kv);
    }

}