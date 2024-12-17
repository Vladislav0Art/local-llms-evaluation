package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedDecodePart_encoding {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private Connection connection;

    @Test
    public void decodePart_encoding() {
        String encoded = "https%3A%2F%2Fexample.com";
        when(connection.getProtocol()).thenReturn("https");
        when(connection.getUserInfo()).thenReturn("");
        when(connection.getHost()).thenReturn(encoded);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URL u = urlBuilder.build();
        assertEquals("https://xn--example-com", u.toString());
    }

}