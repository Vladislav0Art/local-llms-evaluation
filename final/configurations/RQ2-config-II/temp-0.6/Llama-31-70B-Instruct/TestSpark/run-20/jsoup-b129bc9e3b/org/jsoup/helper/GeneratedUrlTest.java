package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedUrlTest {

    @Test
    public void urlTest() {
        HttpConnection httpConn = new HttpConnection();
        URL url = mock(URL.class);
        assertEquals(httpConn, httpConn.url(url));
    }

}