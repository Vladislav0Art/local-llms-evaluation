package org.jsoup.helper;

import org.jsoup.Connection;
import org.hamcrest.Matchers;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GeneratedBuildUrlWithNonAsciiCharactersTest {

    @Test
    public void buildUrlWithNonAsciiCharactersTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("https://öäü.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        URL expectedUrl = new URL("https://xn--4ca9at.com?key=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}