package org.jsoup.helper;

import org.jsoup.Connection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorAndViewInitialQueryTest() throws Exception {
        URL url = new URL("http://www.google.com?q=someText");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("?q=someText", StringUtil.releaseBuilder(urlBuilder.q));
    }

    @Test
    public void UrlBuilderBuildNormalizedUrlTest() throws Exception {
        URL url = new URL("http://www.google.com?q=someText");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL normalizedUrl = urlBuilder.build();
        assertEquals("http://www.google.com?q=someText+", normalizedUrl.toString());
    }

    @Test
    public void UrlBuilderBuildMalformedUrlTest() throws Exception {
        URL url = new URL("htt/www.google.com?q=someText");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValWithNonNullQTest() throws Exception {
        URL url = new URL("http://www.google.com?q=someText");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("newKey");
        when(keyVal.value()).thenReturn("newValue");

        urlBuilder.appendKeyVal(keyVal);
        assertEquals("q=someText&newKey=newValue", StringUtil.releaseBuilder(urlBuilder.q));
    }

    @Test
    public void appendKeyValWithNullQTest() throws Exception {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("newKey");
        when(keyVal.value()).thenReturn("newValue");

        urlBuilder.appendKeyVal(keyVal);
        assertEquals("newKey=newValue", StringUtil.releaseBuilder(urlBuilder.q));
    }

    @Test
    public void normalizeQueryTest() throws Exception {
        assertEquals("A+B+C", UrlBuilder.class.getDeclaredMethod("normalizeQuery", String.class).invoke(null, "A B C"));
    }

    @Test
    public void normalizeRefTest() throws Exception {
        assertEquals("A%20B%20C", UrlBuilder.class.getDeclaredMethod("normalizeRef", String.class).invoke(null, "A B C"));
    }

    @Test
    public void decodePartTest() throws Exception {
        assertEquals("A B C", UrlBuilder.class.getDeclaredMethod("decodePart", String.class).invoke(null, "A%20B%20C"));
    }

    @Test
    public void decodeUnsupportEncodingPartTest() throws Exception {
        assertEquals("A B C", UrlBuilder.class.getDeclaredMethod("decodePart", String.class).invoke(null, "A B C"));
    }

}