package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSslSocketFactoryTest {

    @Test
    public void sslSocketFactoryTest() {
        HttpConnection httpConnection = new HttpConnection();
        SSLSocketFactory sslSocketFactory = Mockito.mock(SSLSocketFactory.class);
        Connection connection = httpConnection.sslSocketFactory(sslSocketFactory);
        assertNotNull(connection);
    }

}