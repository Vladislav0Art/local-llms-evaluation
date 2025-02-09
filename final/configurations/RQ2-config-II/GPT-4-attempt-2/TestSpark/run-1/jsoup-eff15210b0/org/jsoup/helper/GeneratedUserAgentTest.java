package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        HttpConnection conn = new HttpConnection();
        Connection returnConn = conn.userAgent("Mozilla");
        assertNotNull(returnConn);
    }

}