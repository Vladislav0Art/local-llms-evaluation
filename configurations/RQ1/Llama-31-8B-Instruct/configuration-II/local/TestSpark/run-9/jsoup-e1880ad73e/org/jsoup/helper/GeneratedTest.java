package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void build_WithNullUrl_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> urlBuilder.build());
    }

    @Test
    public void build_WithNullUrlQuery_ThrowsNullPointerException() {
        URL url = new URL("http://example.com");
        urlBuilder = new UrlBuilder(url);
        assertThrows(NullPointerException.class, () -> urlBuilder.build());
    }

    @Test
    public void build_WithNullUrlQueryAndRef_ThrowsNullPointerException() {
        URL url = new URL("http://example.com");
        urlBuilder = new UrlBuilder(url);
        urlBuilder.q = null;
        urlBuilder.u.setRef(null);
        assertThrows(NullPointerException.class, () -> urlBuilder.build());
    }

    @Test
    public void build_WithValidUrl_ReturnsNormalizedUrl() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com/path with spaces");
        urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://example.com/path%20with%20spaces", result.toString());
    }

    @Test
    public void build_WithValidUrlAndQuery_ReturnsNormalizedUrl() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com/path with spaces");
        urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://example.com/path%20with%20spaces?key=value", result.toString());
    }

}