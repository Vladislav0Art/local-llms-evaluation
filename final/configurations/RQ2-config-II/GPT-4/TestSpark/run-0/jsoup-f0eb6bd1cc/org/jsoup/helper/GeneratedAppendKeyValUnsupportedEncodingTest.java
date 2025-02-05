package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsx.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    // assuming constructor and build method correctness will be ensured by other methods

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL testUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal testKV = new Connection.KeyVal("test", "\uD800"); //invalid unicode
        urlBuilder.appendKeyVal(testKV);
    }

}