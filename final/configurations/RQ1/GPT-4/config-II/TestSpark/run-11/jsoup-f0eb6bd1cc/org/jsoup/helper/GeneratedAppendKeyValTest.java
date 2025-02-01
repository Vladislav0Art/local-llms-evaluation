package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL newUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(newUrl);

        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        URL result = urlBuilder.build();

        assertEquals("http://www.example.com?key=value", result.toString());
    }

}