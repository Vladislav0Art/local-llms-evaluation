package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectStringUrlTest {

    @Test
    public void connectStringUrlTest() {
        try {
            Connection connection = HttpConnection.connect("https://www.google.com");
            Assert.assertNotNull(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}