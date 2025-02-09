package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class GeneratedProxyTest {

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.proxy("localhost", 4000));
    }

}