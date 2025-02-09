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

public class GeneratedUrlWithStringParameterTest {

    @Test
    public void urlWithStringParameterTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("https://www.google.com");
        Assert.assertEquals("https://www.google.com", httpConnection.request().url().toString());
    }

}