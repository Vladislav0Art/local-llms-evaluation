package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnect_proxy_string_test {

    @Mock
    private HttpURLConnection connection;

    @InjectMocks
    private Connection httpConnection;

    @Test
    public void connect_proxy_string_test() throws IOException {
        when(connection.getProxy()).thenReturn(new Proxy(Proxy.Type.HTTP, "proxy.example.com", 8080));
        try (Connection c = httpConnection.proxy("http://proxy.example.com:8080")) {
            assert c.getProxy().toString().equals("proxy.example.com:8080");
        }
    }

}