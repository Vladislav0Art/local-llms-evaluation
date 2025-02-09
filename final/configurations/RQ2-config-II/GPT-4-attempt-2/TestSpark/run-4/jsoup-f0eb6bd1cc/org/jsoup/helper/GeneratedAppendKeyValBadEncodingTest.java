package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValBadEncodingTest {

    @Test
    public void appendKeyValBadEncodingTest() throws UnsupportedEncodingException {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(url);
            Connection.KeyVal kv = Connection.KeyVal.create("key", "val");
            builder.appendKeyVal(kv);
        } catch (MalformedURLException ex) {
            fail("Malformed URL");
        }
    }

}