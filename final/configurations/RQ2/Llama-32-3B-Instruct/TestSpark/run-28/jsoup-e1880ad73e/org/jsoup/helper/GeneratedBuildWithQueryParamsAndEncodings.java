package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildWithQueryParamsAndEncodings {

    public interface KeyVal {
        boolean of(String key, String value);
    }

    @Test
    public void buildWithQueryParamsAndEncodings() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        when(Connection.KeyVal.of(anyString(), anyString())).thenReturn(true);
        assertEquals("http://example.com?key1=value1&encoding=UTF-8", builder.build().toString());
    }

}