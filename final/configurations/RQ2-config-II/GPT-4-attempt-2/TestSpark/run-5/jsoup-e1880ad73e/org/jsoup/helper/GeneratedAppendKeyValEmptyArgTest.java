package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyValEmptyArgTest {

    @Test
    public void appendKeyValEmptyArgTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = Connection.KeyVal.create("", "");
        urlBuilder.appendKeyVal(kv);
        // the exact assertion can't be given without implementation details
    }

}