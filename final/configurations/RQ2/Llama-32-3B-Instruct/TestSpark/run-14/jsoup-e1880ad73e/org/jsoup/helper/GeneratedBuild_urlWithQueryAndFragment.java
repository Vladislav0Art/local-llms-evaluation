package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_urlWithQueryAndFragment {

    @Mock
    private Connection connection;

    @Test
    public void build_urlWithQueryAndFragment() throws MalformedURLException, URISyntaxException {
        String baseUrl = "http://example.com/base";
        String query = "key=value&foo=bar";
        String fragment = "#anchor";

        UrlBuilder urlBuilder = new UrlBuilder(new URL(baseUrl));
        urlBuilder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        urlBuilder.appendKeyVal(Connection.KeyVal.create("foo", "bar"));

        URI uri = Mockito.mock(URI.class);
        Mockito.when(uri.resolve("/path/to/resource")).thenReturn(uri);
        Mockito.when(connection.request()).thenReturn(uri);

        URL result = urlBuilder.build();
        assertEquals(baseUrl, result.toString());
    }

}