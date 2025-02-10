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
public class GeneratedConnect_string_url_postDataCharset_test {

    @Mock
    private HttpURLConnection connection;

    @InjectMocks
    private Connection httpConnection;

    @Test
    public void connect_string_url_postDataCharset_test() throws IOException {
        Map<String, String> data = new HashMap<>();
        when(connection.getURL()).thenReturn(new URL("http://example.com"));
        try (Connection c = httpConnection.url("http://example.com")) {
            c.postDataCharset(UTF_8);
            assert c.getRequest().getHeaders().containsKey("Content-Type");
        }
    }

}