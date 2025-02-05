package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class GeneratedUrlURLTest {

    @Test
    public void urlURLTest() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();
        URL url = new URL("http://example.com");
        httpConnection.url(url);
        Assert.assertEquals(httpConnection.request().url(), url);
    }

}