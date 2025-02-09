package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyValNullArgTest {

    @Test
    public void appendKeyValNullArgTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(null));
    }

}