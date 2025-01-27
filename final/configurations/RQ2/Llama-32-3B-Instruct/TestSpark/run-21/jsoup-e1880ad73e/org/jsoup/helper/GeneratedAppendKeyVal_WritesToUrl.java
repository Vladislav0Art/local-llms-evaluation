package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
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
public class GeneratedAppendKeyVal_WritesToUrl {

    @Mock
    private Connection connection;

    @Test
    public void appendKeyVal_WritesToUrl() {
        // Arrange
        Mockito.when(connection.getScheme()).thenReturn("https");
        Mockito.when(connection.getHost()).thenReturn("example.com");

        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);

        // Act
        String url = Mockito.spy(connection.toString());
        builder.build();

        // Assert
        assert url.startsWith("https:");
        assert url.contains("?key=value");
    }

}