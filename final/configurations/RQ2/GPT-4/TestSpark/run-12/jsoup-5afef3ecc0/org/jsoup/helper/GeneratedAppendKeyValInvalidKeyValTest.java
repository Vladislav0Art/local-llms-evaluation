package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValInvalidKeyValTest {

    @Test
    public void appendKeyValInvalidKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal invalidKeyVal = new Connection.KeyVal("", "");
        urlBuilder.appendKeyVal(invalidKeyVal);
    }

}