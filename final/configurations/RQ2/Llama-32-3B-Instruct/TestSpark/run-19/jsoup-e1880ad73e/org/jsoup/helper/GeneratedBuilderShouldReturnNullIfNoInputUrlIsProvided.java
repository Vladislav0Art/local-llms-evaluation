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
public class GeneratedBuilderShouldReturnNullIfNoInputUrlIsProvided {

    public static class UrlBuilderTest {
        @Mock
        private Connection connection;

        public UrlBuilderTest() {
        }

        public UrlBuilder buildUrlBuilder() {
            return new UrlBuilder(connection);
        }

        @Test
        public void builderShouldReturnNullIfNoInputUrlIsProvided() {
            UrlBuilder urlBuilder = buildUrlBuilder();
            assertNull(urlBuilder);
        }

    }