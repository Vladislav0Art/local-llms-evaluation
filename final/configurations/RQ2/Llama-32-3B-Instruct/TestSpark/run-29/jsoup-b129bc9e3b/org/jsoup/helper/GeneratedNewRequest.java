package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewRequest {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieStore cookieStore;

    public HttpConnection() {
        // Test: no-arg constructor
        assert true;
    }

    @Test
    public void newRequest() {
        // Test: creation of a new request
        Connection conn = HttpConnection.connect("https://www.example.com");
        assert conn != null;
    }

}