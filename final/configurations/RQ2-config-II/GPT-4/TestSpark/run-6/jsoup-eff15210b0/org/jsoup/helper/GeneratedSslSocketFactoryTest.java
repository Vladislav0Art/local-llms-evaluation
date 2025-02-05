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

public class GeneratedSslSocketFactoryTest {

    @Test
    public void sslSocketFactoryTest() {
        HttpConnection httpConnection = new HttpConnection();
        SSLSocketFactory sslSocketFactory = Mockito.mock(SSLSocketFactory.class);

        Connection connection = httpConnection.sslSocketFactory(sslSocketFactory);

        Assert.assertNotNull(connection);
    }

}