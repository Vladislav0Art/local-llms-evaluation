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

public class GeneratedBuildUrlWithNonAsciiPathComponentTest {

    public static class MockUrlBuilder extends UrlBuilder {
        @Override
        public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
            // just return the StringBuilder, mock it later in a method call
        }
    }

    @Test
    public void buildUrlWithNonAsciiPathComponentTest() {
        URL inputUrl = new URL("http://test.com/à");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        String expectedUrl = "http%2f//test.com/%C3%A0";
        assertEquals(new URL(expectedUrl), builder.build());
    }

}