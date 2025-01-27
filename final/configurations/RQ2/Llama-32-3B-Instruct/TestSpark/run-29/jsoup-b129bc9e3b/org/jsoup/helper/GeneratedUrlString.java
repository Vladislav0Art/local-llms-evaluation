package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlString {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieStore cookieStore;

    public HttpConnection() {
        // Test: no-arg constructor
        assert true;
    }

    @Test
    public void urlString() {
        // Test: setting URL from string
        String urlStr = "https://www.example.com";
        String expectedUrl = "https://www.example.com";
        Connection conn = HttpConnection.url(urlStr);
        assertEquals(expectedUrl, conn.url());
    }

}