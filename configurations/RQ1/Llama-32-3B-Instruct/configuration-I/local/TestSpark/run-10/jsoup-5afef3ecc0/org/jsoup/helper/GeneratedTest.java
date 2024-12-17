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
public class GeneratedTest {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private Connection connection;

    @Test
    public void build_URL_with_valid_input() {
        when(connection.getProtocol()).thenReturn("http");
        when(connection.getUserInfo()).thenReturn("");
        when(connection.getHost()).thenReturn("example.com");
        when(connection.getPath()).thenReturn("/path/to/resource");
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        URL url = urlBuilder.build();
        assertNotNull(url);
    }

    @Test
    public void build_URL_with_invalid_input() {
        when(connection.getProtocol()).thenReturn("invalid");
        when(connection.getUserInfo()).thenReturn("");
        when(connection.getHost()).thenReturn("example.com");
        when(connection.getPath()).thenReturn("/path/to/resource");
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        URL url = urlBuilder.build();
        assertNotNull(url);
    }

    @Test
    public void build_URL_with_puny_coding() {
        when(connection.getProtocol()).thenReturn("http");
        when(connection.getUserInfo()).thenReturn("");
        when(connection.getHost()).thenReturn("example.com");
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        URL url = urlBuilder.build();
        assertEquals("http://xn--example-com/path/to/resource", url.toString());
    }

    @Test
    public void appendKeyVal_query_string() {
        String query = "key1=value1&key2=value2";
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
    }

    @Test
    public void appendKeyVal_query_string_without_key() {
        String query = "key1=value1&key2=value2";
        when(kv.key()).thenReturn(null);
        when(kv.value()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
    }

    @Test
    public void appendKeyVal_ref_string() {
        String ref = "abc";
        when(kv.key()).thenReturn(null);
        when(kv.value()).thenReturn(ref);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
        assertEquals("%20", urlBuilder.q.toString());
    }

    @Test
    public void appendKeyVal_ref_string_without_value() {
        String ref = "abc";
        when(kv.key()).thenReturn(null);
        when(kv.value()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
    }

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

    @Test
    public void normalizeQuery_string_with_space() {
        String q = "key1=value1&key2+value2";
        when(kv.key()).thenReturn(null);
        when(kv.value()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
        assertEquals("key1=value1%2Bkey2%2Bvalue2", urlBuilder.q.toString());
    }

    @Test
    public void normalizeRef_string_with_space() {
        String r = "abc";
        when(connection.getProtocol()).thenReturn("http");
        when(connection.getUserInfo()).thenReturn("");
        when(connection.getHost()).thenReturn(r);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URL u = urlBuilder.build();
        assertEquals("http://%20abc", u.toString());
    }

}