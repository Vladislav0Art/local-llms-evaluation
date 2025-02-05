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

public class GeneratedConnectUrlTest {

    @Test
    public void connectUrlTest() {
        try {
            URL url = new URL("http://google.com");
            Connection connection = HttpConnection.connect(url);
            Assert.assertNotNull(connection);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}