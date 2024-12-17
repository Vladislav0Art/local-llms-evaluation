package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.concurrent.Callable;

public class GeneratedBuildUrlWithQueryFromValidUrlTest {

    public static class MockUrlBuilder extends UrlBuilder {
        @Override
        public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
            // just return the StringBuilder, mock it later in a method call
        }
    }

    @Test
    public void buildUrlWithQueryFromValidUrlTest() {
        URL inputUrl = new URL("http://test.com/path?a=1&b=2");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://test.com/path?a=1%26b=2");
        assertEquals(expectedUrl, builder.build());
    }

}