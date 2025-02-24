package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class GeneratedTestProxy {

    private HttpConnection connection;

    @BeforeEach
    public void setUp() {
        connection = new HttpConnection();
    }

    @Test
    public void testProxy() {
        HttpConnection.Request request = connection.request();
        assertNull(request.proxy());

        connection.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080)));
        assertNotNull(request.proxy());
    }

}