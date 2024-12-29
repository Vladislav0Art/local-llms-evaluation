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

public class GeneratedSslSocketFactoryTest {

    @Test
    public void sslSocketFactoryTest() {
        HttpConnection connection = new HttpConnection();
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        Assert.assertEquals(connection, connection.sslSocketFactory(factory));
    }

}