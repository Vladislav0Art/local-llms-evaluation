package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedProxy {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieStore cookieStore;

    @Test
    public void proxy() {
        // Test: setting proxy from URL object
        URI uri = new URI("http://localhost", null, "/proxy", null, null, 8080, null);
        String host = "localhost";
        int port = 8080;
        Connection conn = HttpConnection.proxy(uri.getHost(), uri.getPort());
        assertEquals(host, conn.proxy().host());
    }

}