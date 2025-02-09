package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.proxy("127.0.0.1", 8080);
        assertNotNull(connection);
    }

}