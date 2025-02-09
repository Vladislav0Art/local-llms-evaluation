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

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key", "value", inputStream, "text/plain");
        httpConnection.userAgent("Mozilla");
        Connection.Response response = httpConnection.execute();
        Assert.assertNotNull(response);
    }

}