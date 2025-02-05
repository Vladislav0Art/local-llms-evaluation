package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL input = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(input);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        Assert.assertTrue(urlBuilder.build().toString().contains("key=value"));
    }

}