package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = null;
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(keyVal);
    }

}