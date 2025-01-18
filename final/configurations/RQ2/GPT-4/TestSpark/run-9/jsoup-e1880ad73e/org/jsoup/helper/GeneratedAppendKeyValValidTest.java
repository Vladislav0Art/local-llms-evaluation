package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() throws Exception {
        URL testUrl = new URL("https://www.example.com");
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");

        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        urlBuilder.appendKeyVal(keyVal);

        URL resultUrl = urlBuilder.build();

        assertNotNull(resultUrl);
        assertEquals("https://www.example.com?key=value", resultUrl.toString());
    }

}