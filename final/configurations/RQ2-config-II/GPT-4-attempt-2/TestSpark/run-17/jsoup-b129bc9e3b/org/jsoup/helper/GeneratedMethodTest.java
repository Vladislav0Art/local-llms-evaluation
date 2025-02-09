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

public class GeneratedMethodTest {

    @Test
    public void methodTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Method method = Connection.Method.GET;
        Connection connection = httpConnection.method(method);
        assertNotNull(connection);
    }

}