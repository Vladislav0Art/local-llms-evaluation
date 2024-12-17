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
public class GeneratedBuild_URL_with_valid_input {

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

}