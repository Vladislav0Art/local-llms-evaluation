package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedMaxBodySizeTest {

    @Test
    public void maxBodySizeTest() {
        HttpConnection httpConn = new HttpConnection();
        int maxBodySize = 1000;
        assertEquals(httpConn, httpConn.maxBodySize(maxBodySize));
    }

}