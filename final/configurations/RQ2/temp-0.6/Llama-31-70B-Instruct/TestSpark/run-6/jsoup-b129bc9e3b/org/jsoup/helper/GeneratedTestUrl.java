package org.jsoup.helper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestUrl {

    private HttpConnection httpConnection;

    @Mock
    private Connection.Request request;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        httpConnection = new HttpConnection();
    }

    @Test
    public void testUrl() throws MalformedURLException {
        String url = "https://www.example.com";
        httpConnection.url(url);
        assertEquals(url, httpConnection.url().toString());
    }

}