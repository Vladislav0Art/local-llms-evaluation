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

public class GeneratedDataKeyValueTest {

    @Test
    public void dataKeyValueTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.data("key", "value");

        Assert.assertNotNull(connection);
    }

}