package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class GeneratedUrlWithUrlParameterTest {

    @Test
    public void urlWithUrlParameterTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com");
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        Assert.assertEquals(url, httpConnection.request().url());
    }

}