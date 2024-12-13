package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
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
public class GeneratedBuild_WithValidUrl_ReturnsNormalizedUrl {

    @Test
    public void build_WithValidUrl_ReturnsNormalizedUrl() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        when(urlBuilder.u.getProtocol()).thenReturn("http");
        when(urlBuilder.u.getHost()).thenReturn("example.com");
        when(urlBuilder.u.getPath()).thenReturn("/path with spaces");
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://example.com/path%20with%20spaces", result.toString());
    }

}