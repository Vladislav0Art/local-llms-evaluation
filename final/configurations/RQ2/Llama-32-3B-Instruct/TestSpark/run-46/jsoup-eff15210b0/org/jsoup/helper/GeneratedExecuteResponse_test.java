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
public class GeneratedExecuteResponse_test {

    @Mock
    private HttpURLConnection connection;

    @InjectMocks
    private Connection httpConnection;

    @Test
    public void executeResponse_test() throws IOException {
        Connection.Response response = new Connection.Response();
        when(connection.getResponse()).thenReturn(response);
        try (Connection c = httpConnection.connect(new URL("http://example.com"))) {
            assert c.execute().getResponse().equals(response);
        }
    }

}