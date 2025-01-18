package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSslSocketFactoryTest {

    @Test
    public void sslSocketFactoryTest() {
        SSLSocketFactory socketFactory = Mockito.mock(SSLSocketFactory.class);
        HttpConnection connection = (HttpConnection) HttpConnection.connect("http://www.google.com");
        connection.sslSocketFactory(socketFactory);
        Assert.assertEquals(connection.request().sslSocketFactory(), socketFactory);
    }

}