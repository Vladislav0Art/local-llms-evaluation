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

public class GeneratedBuildWithoutQueryTest {

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

}