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
public class GeneratedAppendKeyValShouldAppendKeyValueToUrl {

    public static class UrlBuilderTest {
        @Mock
        private Connection connection;

        public UrlBuilderTest() {
        }

        public UrlBuilder buildUrlBuilder() {
            return new UrlBuilder(connection);
        }

        @Test
        public void appendKeyValShouldAppendKeyValueToUrl() throws UnsupportedEncodingException {
            String url = "http://example.com";
            String key = "key";
            String value = "value";

            when(connection.getBaseUri()).thenReturn(new URI("http://example.com"));

            UrlBuilder urlBuilder = buildUrlBuilder();
            urlBuilder.appendKeyVal(Connection.KeyVal.of(key, value));

            assertEquals("http://example.com?key=value", urlBuilder.build().toString());
        }

    }