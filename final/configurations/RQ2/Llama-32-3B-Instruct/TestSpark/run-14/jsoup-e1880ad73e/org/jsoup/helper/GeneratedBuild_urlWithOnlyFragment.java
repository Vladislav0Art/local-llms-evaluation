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
public class GeneratedBuild_urlWithOnlyFragment {

    @Mock
    private Connection connection;

    @Test
    public void build_urlWithOnlyFragment() throws MalformedURLException {
        String baseUrl = "http://example.com/base";

        UrlBuilder urlBuilder = new UrlBuilder(new URL(baseUrl));
        Connection.KeyVal kv1 = Mockito.mock(Connection.KeyVal.class);
        Connection.KeyVal kv2 = Mockito.mock(Connection.KeyVal.class);

        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        URI uri = Mockito.mock(URI.class);
        Mockito.when(uri.resolve("/path/to/resource")).thenReturn(uri);
        Mockito.when(connection.request()).thenReturn(uri);
        Mockito.when(uri.getFragment()).thenReturn("#anchor");

        URL result = urlBuilder.build();
        assertEquals(baseUrl + "#anchor", result.toString());
    }

}