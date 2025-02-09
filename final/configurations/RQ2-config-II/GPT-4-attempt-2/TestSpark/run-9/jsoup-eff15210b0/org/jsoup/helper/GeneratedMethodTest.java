package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedMethodTest {

    @Test
    public void methodTest() {
        Connection.Method method = Connection.Method.POST;
        HttpConnection connection = new HttpConnection();
        connection.method(method);
        assertEquals(method, connection.request().method());
    }

}