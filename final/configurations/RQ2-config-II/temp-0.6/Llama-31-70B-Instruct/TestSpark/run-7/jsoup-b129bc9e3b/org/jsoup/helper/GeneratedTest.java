package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private HttpConnection connection;

    @BeforeEach
    public void setUp() {
        connection = new HttpConnection();
    }

    @Test
    public void testConnect() {
        URL url = Mockito.mock(URL.class);
        when(url.getHost()).thenReturn("jsoup.org");

        Connection.Response response = connection.connect(url).execute();
        assertNotNull(response);
    }

    @Test
    public void testProxy() {
        HttpConnection.Request request = connection.request();
        assertNull(request.proxy());

        connection.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080)));
        assertNotNull(request.proxy());
    }

    @Test
    public void testParser() {
        assertNotNull(connection.parser());

        connection.parser(new Parser() {
            @Override
            public Document parseInput(String input, String baseUri) {
                return null;
            }
        });
        assertNotNull(connection.parser());
    }

}