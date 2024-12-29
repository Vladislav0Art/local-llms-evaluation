package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedPostTest {

    @Test
    public void postTest() throws IOException {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("http://example.com");
        Assert.assertNotNull(connection.post());
    }

}