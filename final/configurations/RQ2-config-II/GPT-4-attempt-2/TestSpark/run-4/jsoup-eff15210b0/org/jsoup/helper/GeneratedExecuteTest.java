package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedExecuteTest {

    // testing connect(String)

    @Test
    public void executeTest() {
        String url = "http://www.google.com";
        Connection connection = HttpConnection.connect(url);
        try {
            connection.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(connection);
    }

}