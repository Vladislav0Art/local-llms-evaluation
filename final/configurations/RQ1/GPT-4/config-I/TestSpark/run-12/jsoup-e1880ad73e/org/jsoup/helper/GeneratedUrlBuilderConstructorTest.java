package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://www.google.com?query=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);
        assertEquals("www.google.com", urlBuilder.u.getHost());
        assertEquals("http", urlBuilder.u.getProtocol());
        assertEquals("/?query=test", urlBuilder.u.getFile());
        assertEquals("query=test", urlBuilder.q.toString());
    }

}