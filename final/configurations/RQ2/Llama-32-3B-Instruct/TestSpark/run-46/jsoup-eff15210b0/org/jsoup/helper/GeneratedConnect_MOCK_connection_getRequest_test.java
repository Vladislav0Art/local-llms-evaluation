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
public class GeneratedConnect_MOCK_connection_getRequest_test {

    @Mock
    private HttpURLConnection connection;

    @InjectMocks
    private Connection httpConnection;

    @Test
    public void connect_MOCK_connection_getRequest_test() throws IOException {
        Connection.Request request = new Connection.Request();
        when(connection.getRequestMethod()).thenReturn(Connection.Method.GET);
        try (Connection c = httpConnection.newRequest()) {
            assert c.getRequest().getMethod().equals(Connection.Method.GET);
        }
    }

}