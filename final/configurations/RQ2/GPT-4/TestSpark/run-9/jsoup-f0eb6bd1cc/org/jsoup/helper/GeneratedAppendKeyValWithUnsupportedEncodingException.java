package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithUnsupportedEncodingException {

    @Test
    public void appendKeyValWithUnsupportedEncodingException() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyVal = Connection.data("key", "イリノイ");

        urlBuilder.appendKeyVal(keyVal);
    }

}