package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.internal.ConstrainableInputStream;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.Proxy;
import javax.net.ssl.SSLSocketFactory;

public class GeneratedConnectUrlTest {

    @Test
    public void connectUrlTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("https://github.com/"));
        assertEquals("https://github.com/", connection.response().url());
    }

}