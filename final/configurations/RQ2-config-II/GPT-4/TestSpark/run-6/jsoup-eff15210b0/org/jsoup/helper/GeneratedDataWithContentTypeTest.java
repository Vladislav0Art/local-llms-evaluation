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

public class GeneratedDataWithContentTypeTest {

    @Test
    public void dataWithContentTypeTest() {
        HttpConnection httpConnection = new HttpConnection();
        InputStream inputStream = Mockito.mock(InputStream.class);

        Connection connection = httpConnection.data("key", "file.txt", inputStream, "text/plain");

        Assert.assertNotNull(connection);
    }

}