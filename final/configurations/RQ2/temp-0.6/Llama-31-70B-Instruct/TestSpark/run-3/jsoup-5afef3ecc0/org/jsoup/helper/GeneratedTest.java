package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void buildNullUrlTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNull(urlBuilder.build());
    }

    @Test
    public void buildMalformedUrlTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://invalid:80"));
        assertNull(urlBuilder.build());
    }

    @Test
    public void buildValidUrlTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://valid.com"));
        assertNotNull(urlBuilder.build());
    }

    @Test
    public void appendKeyValNullTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://valid.com"));
        assertNull(urlBuilder.appendKeyVal(null));
    }

    @Test
    public void appendKeyValValidTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://valid.com"));
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        assertNull(urlBuilder.appendKeyVal(keyVal));
    }

}