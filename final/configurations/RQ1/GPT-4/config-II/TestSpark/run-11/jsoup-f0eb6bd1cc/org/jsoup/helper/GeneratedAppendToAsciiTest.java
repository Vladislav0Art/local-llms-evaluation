package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws UnsupportedEncodingException {
        UrlBuilder.appendToAscii("test str", true, new StringBuilder());
    }

}