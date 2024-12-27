package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDataWithInputStreamTest {

    @Test
    public void dataWithInputStreamTest() throws Exception {
        String key = "image";
        String filename = "test.jpg";
        InputStream inputStream = mock(InputStream.class);
        HttpConnection connection = new HttpConnection();
        connection.data(key, filename, inputStream);
        // verify if the data has been set - by calling data method again with the key
        assertNotNull(connection.data(key));
    }

}