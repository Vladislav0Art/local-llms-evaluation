package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mockito;

public class GeneratedBuild {

    @Test
    public void build() throws URISyntaxException, UnsupportedEncodingException {
        // valid URL
        String url = "https://example.com";
        Connection connection = Mockito.mock(Connection.class);
        when(connection.toString()).thenReturn(url);
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        assertEquals(url, urlBuilder.build());
        verifyNoMoreInteractions(connection);
    }

}