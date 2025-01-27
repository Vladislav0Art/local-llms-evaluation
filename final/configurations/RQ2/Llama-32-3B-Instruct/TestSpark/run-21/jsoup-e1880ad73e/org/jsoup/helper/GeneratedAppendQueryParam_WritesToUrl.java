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
public class GeneratedAppendQueryParam_WritesToUrl {

    @Mock
    private Connection connection;

    @Test
    public void appendQueryParam_WritesToUrl() {
        // Arrange
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        // Act
        String url = Mockito.spy(connection.toString());
        builder.appendKeyVal(kv);

        // Assert
        assert url.startsWith("https:");
        assert url.contains("?key=value");
    }

}