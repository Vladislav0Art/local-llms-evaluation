package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAppendKeyValWithValidKeyValTest {

    @Test
    public void appendKeyValWithValidKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal validKeyVal = Mockito.mock(Connection.KeyVal.class);
        when(validKeyVal.toString()).thenReturn("key=value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));

        // Act
        urlBuilder.appendKeyVal(validKeyVal);

        // Assert
        // No assertions required
    }

}