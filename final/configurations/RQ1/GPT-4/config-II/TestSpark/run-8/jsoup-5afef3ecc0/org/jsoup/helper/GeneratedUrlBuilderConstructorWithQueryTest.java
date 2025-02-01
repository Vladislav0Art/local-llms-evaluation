package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedUrlBuilderConstructorWithQueryTest {

    @Test
    public void urlBuilderConstructorWithQueryTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("key=value", urlBuilder.q.toString());
    }

}