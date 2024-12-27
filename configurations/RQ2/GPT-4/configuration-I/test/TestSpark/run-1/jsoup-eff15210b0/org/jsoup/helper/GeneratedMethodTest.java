package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.InputStream;
import java.net.Proxy;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class GeneratedMethodTest {

    @Test
    public void methodTest() {
        Connection connection = new HttpConnection();
        Connection.Request request = mock(Connection.Request.class);
        connection.request(request);
        connection.method(Connection.Method.GET);
    }

}