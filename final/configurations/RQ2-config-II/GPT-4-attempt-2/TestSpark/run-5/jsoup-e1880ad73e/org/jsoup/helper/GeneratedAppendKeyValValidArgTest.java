package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyValValidArgTest {

    @Test
    public void appendKeyValValidArgTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        // the exact assertion can't be given without implementation details
    }

}