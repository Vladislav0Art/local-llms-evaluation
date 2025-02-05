package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import org.jsoup.Connection;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        URL url = null;
        try {
            url = new URL("https://www.google.com");
        } catch (MalformedURLException e) {
            fail("MalformedURLException thrown");
        }

        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = () -> null;
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            fail("UnsupportedEncodingException thrown");
        }

        // No exception is expected, so no assertion to make
    }

}