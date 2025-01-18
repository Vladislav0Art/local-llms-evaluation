package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyValue = createKeyVal("key", "value");
        urlBuilder.appendKeyVal(keyValue);
        URL expectedUrl = new URL("https://www.google.com/?key=value");
        assertEquals(urlBuilder.build(), expectedUrl);
    }

}