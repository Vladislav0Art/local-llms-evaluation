package org.jsoup.helper;

import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValNullInputTest {

    @Test
    public void appendKeyValNullInputTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            urlBuilder.appendKeyVal(null);
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            fail("Appending KeyVal to UrlBuilder failed with an exception");
        }
    }

}