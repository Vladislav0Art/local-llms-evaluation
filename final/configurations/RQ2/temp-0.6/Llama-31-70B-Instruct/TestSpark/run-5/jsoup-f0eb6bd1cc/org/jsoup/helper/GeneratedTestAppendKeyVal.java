package org.jsoup.helper;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        // Arrange
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");
        builder.appendKeyVal(kv);

        // Assert
        assertEquals("key=value", builder.q.toString());
    }

}