package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://www.google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(null);
    }

}