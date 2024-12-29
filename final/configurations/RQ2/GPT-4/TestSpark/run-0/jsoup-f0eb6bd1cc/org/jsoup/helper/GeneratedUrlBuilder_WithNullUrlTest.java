package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilder_WithNullUrlTest {

    @Test
    public void UrlBuilder_WithNullUrlTest() throws MalformedURLException {
        URL inputUrl = null;
        new UrlBuilder(inputUrl);
    }

}