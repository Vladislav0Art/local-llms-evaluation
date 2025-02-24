package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() {
        HttpConnection httpConn = new HttpConnection();
        String url = "http://www.example.com/";
        assertEquals(httpConn, httpConn.url(url));
    }

}