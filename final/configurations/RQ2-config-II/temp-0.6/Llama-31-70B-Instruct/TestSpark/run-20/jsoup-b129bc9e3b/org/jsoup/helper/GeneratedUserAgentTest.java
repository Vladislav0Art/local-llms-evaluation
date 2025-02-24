package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        HttpConnection httpConn = new HttpConnection();
        String userAgent = "Chrome";
        assertEquals(httpConn, httpConn.userAgent(userAgent));
    }

}