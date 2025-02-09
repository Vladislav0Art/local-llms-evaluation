package org.jsoup.helper;

import org.jsoup.Connection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSslSocketFactoryTest {

    @Test
    public void sslSocketFactoryTest() {
        SSLSocketFactory socketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        Connection connection = new HttpConnection();
        connection.sslSocketFactory(socketFactory);
        assertEquals(socketFactory, connection.request().sslSocketFactory());
    }

}