package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.jsoup.Connection;

public class GeneratedAppendKeyValTest_UseInvalidEncoding {

    @Test
    public void appendKeyValTest_UseInvalidEncoding() throws UnsupportedEncodingException {
        URL url;
        try {
            url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyVal = Connection.KeyVal.create("\n", "value");
            urlBuilder.appendKeyVal(keyVal);
        } catch (MalformedURLException e) {
            fail("Test failed due to MalformedURLException");
        }
    }

}