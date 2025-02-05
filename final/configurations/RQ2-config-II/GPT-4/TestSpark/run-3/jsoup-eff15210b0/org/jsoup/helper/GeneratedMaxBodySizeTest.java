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

public class GeneratedMaxBodySizeTest {

    @Test
    public void maxBodySizeTest() {
        HttpConnection connection = new HttpConnection();
        connection.maxBodySize(2048);
        assertEquals(2048, connection.request().maxBodySize());
    }

}