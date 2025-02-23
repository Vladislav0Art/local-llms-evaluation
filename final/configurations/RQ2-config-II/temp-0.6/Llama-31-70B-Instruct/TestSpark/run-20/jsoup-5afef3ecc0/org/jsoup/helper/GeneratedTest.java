package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.mockito.Mockito;

import java.net.URL;

import org.jsoup.Connection.KeyVal;

import java.io.UnsupportedEncodingException;

import org.jsoup.internal.StringUtil;

import static org.mockito.Matchers.any;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
    }

    @Test
    public void buildWithoutQueryTest() {
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com", builtUrl.toString());
    }

    @Test
    public void buildWithQueryTest() throws UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new KeyVal("key2", "value2"));
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com?key1=value1&key2=value2", builtUrl.toString());
    }

    @Test
    public void buildWithQueryWithSpacesTest() throws UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new KeyVal("key1", "value 1"));
        urlBuilder.appendKeyVal(new KeyVal("key2", "value 2"));
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com?key1=value+1&key2=value+2", builtUrl.toString());
    }

}