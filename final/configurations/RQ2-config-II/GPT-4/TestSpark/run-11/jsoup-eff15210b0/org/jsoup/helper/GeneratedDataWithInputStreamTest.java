package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataWithInputStreamTest {

    @Test
    public void dataWithInputStreamTest() {
        HttpConnection connection = new HttpConnection();
        InputStream stream = Mockito.mock(InputStream.class);
        connection.data("key", "filename", stream);
        Assert.assertNotNull(connection.request().data());
    }

}