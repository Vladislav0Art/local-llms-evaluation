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
public class GeneratedUrl_connection_test {

    @Mock
    private HttpURLConnection connection;

    @InjectMocks
    private Connection httpConnection;

    @Test
    public void url_connection_test() throws IOException {
        when(connection.getURL()).thenReturn(new URL("http://example.com"));
        try (Connection c = httpConnection.url(connection)) {
            assert c.getURL().toString().equals("http://example.com");
        }
    }

}