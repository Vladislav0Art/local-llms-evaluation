package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestUserAgent {

    @Mock
    private Connection.Request request;

    private HttpConnection httpConnection;

    @Before
    public void setUp() throws Exception {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testUserAgent() throws IOException {
        String userAgent = "Mozilla/5.0";
        HttpConnection connection = new HttpConnection();
        connection.userAgent(userAgent);
        assertEquals(userAgent, connection.request().userAgent());
    }

}