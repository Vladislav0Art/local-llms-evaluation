package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        // No assertions as the method has no return value and no side effects.
    }

}