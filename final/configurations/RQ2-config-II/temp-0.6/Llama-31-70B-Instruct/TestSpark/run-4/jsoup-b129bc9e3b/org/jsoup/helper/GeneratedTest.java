package org.jsoup.helper;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private HttpConnection httpConnection;

    @BeforeEach
    void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testUrl() {
        String url = "https://www.example.com";
        URL expectedUrl = mock(URL.class);
        when(expectedUrl.toString()).thenReturn(url);
        when(httpConnection.url(url)).thenReturn(expectedUrl);
        assertEquals(expectedUrl, httpConnection.url(url));
    }

}