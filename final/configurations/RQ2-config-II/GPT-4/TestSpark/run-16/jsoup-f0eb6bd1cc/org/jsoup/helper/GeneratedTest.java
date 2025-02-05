package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();

        assertThat(outputUrl, is(inputUrl));
    }

    @Test
    public void buildNullUrlTest() {
        URL inputUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyValue = mock(Connection.KeyVal.class);
        when(keyValue.key()).thenReturn("key");
        when(keyValue.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyValue);
        URL outputUrl = urlBuilder.build();

        assertThat(outputUrl.toString(), containsString("?key=value"));
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyValue = mock(Connection.KeyVal.class);
        when(keyValue.key()).thenReturn("\u0000");
        when(keyValue.value()).thenReturn("value");

        urlBuilder.appendKeyVal(keyValue);
    }

}