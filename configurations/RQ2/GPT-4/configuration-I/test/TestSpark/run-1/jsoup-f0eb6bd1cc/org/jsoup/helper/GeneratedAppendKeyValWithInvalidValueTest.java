package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import org.mockito.Mockito;

public class GeneratedAppendKeyValWithInvalidValueTest {

    @Test
    public void AppendKeyValWithInvalidValueTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "\uD83D\uDE0E"); // emoticon as value
        urlBuilder.appendKeyVal(kv);
    }

}