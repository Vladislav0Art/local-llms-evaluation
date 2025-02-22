package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        try {
            URL url = new URL("http://www.example.com/test");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
            urlBuilder.appendKeyVal(keyVal);
            URL builtUrl = urlBuilder.build();
            assertEquals("http://www.example.com/test?key=value", builtUrl.toString());
        } catch (MalformedURLException e) {
            fail("URL is not valid: " + e.getMessage());
        }
    }

}