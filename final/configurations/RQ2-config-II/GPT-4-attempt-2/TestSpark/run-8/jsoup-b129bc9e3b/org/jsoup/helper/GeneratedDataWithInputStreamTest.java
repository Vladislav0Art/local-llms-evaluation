package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDataWithInputStreamTest {

    @Test
    public void dataWithInputStreamTest() {
        HttpConnection httpConnection = new HttpConnection();
        InputStream inputStream = new ByteArrayInputStream("test data".getBytes());
        Connection connection = httpConnection.data("key1", "filename1", inputStream);
        Connection.KeyVal keyVal = connection.request().data().get(0);
        assertEquals(keyVal.key(), "key1");
        assertEquals(keyVal.value(), "test data");
    }

}