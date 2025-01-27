package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnect {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieStore cookieStore;

    public HttpConnection() {
        // Test: no-arg constructor
        assert true;
    }

    @Test
    public void connect() {
        // Test: connection to a valid URL
        String url = "https://www.example.com";
        HttpConnection conn = HttpConnection.connect(url);
        Mockito.verify(conn).newRequest();
        Mockito.verifyNoMoreInteractions(conn);
    }

}