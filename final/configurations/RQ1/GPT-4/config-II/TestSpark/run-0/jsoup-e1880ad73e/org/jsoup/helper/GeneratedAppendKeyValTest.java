package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        URL newUrl = urlBuilder.build();
        assertNotNull(newUrl);
        assertTrue(newUrl.toString().contains("?key=value"));
    }

}