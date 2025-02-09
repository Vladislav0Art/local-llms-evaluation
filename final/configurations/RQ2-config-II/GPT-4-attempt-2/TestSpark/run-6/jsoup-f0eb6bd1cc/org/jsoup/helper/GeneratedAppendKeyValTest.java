package org.jsoup.helper;

import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
            urlBuilder.appendKeyVal(kv);
            URL buildUrl = urlBuilder.build();
            assertTrue(buildUrl.toString().contains("key=value"));
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            fail("Appending KeyVal to UrlBuilder failed with an exception");
        }
    }

}