package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataStreamTest {

    @Test
    public void dataStreamTest() {
        HttpConnection httpConnection = new HttpConnection();
        InputStream stream = new ByteArrayInputStream("test data".getBytes());
        Assert.assertEquals(httpConnection, httpConnection.data("key", "filename", stream));
    }

}