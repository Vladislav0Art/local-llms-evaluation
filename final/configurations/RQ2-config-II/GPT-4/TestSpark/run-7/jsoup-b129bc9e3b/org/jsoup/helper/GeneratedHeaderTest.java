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

public class GeneratedHeaderTest {

    @Test
    public void headerTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.header("key", "value");
        Assert.assertEquals(httpConnection.request().headers().get("key"), "value");
    }

}