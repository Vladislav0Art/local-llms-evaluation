package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValInvalidEncodingTest {

    @Test
    public void appendKeyValInvalidEncodingTest() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Connection.KeyVal.create("name", "välue");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(keyVal);
    }

}