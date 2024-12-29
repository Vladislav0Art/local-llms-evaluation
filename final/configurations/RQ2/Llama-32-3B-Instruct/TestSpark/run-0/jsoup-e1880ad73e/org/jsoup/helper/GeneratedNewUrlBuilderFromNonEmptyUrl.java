package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.jsoup.helper.DataUtil.UTF_8;
import static org.jsoup.helper.UrlBuilder.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewUrlBuilderFromNonEmptyUrl {

    @RunWith(MockitoJUnitRunner.class)
    public class UrlBuilderTest {

        @Mock
        private Connection connection;

        @Mock
        private URL url;

        @Test
        public void newUrlBuilderFromNonEmptyUrl() {
            String expected = "http://example.com";
            UrlBuilder builder = new UrlBuilder(url);
            builder.appendKeyVal(connection.KeyVal("key", "value"));
            URI uri = url.toURI();
            assertEquals(expected, uri.toString());
        }

    }