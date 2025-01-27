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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValShouldHandleQueryProperly {

    public static class UrlBuilderTest {
        @Mock
        private Connection connection;

        public UrlBuilderTest() {
        }

        public UrlBuilder buildUrlBuilder() {
            return new UrlBuilder(connection);
        }

        @Test
        public void appendKeyValShouldHandleQueryProperly() throws UnsupportedEncodingException {
            String url = "http://example.com";
            String key1 = "key1";
            String value1 = "value1";
            String key2 = "key2";
            String value2 = "value2";

            when(connection.getBaseUri()).thenReturn(new URI("http://example.com"));
            when(connection.getQueryParameters()).thenReturn(Map.of(key1, value1));
            when(connection.getParams()).thenReturn(Map.of(key2, value2));

            UrlBuilder urlBuilder = buildUrlBuilder();
            urlBuilder.appendKeyVal(Connection.KeyVal.of(key1, value1));
            urlBuilder.appendKeyVal(Connection.KeyVal.of(key2, value2));

            assertEquals("http://example.com?key1=value1&key2=value2", urlBuilder.build().toString());
        }

    }