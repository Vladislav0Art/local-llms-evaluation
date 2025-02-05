package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void urlBuilderTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertNotNull(urlBuilder);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL resultUrl = urlBuilder.build();
            assertNotNull(resultUrl);
            assertEquals("http", resultUrl.getProtocol());
            assertEquals("example.com", resultUrl.getHost());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void appendKeyValTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
            when(keyValMock.key()).thenReturn("testKey");
            when(keyValMock.value()).thenReturn("testValue");
            urlBuilder.appendKeyVal(keyValMock);
            URL resultUrl = urlBuilder.build();
            assertTrue(resultUrl.query.contains("testKey=testValue"));
        } catch (UnsupportedEncodingException | MalformedURLException uee) {
            fail(uee.getMessage());
        }
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
            when(keyValMock.key()).thenReturn("testKey");
            when(keyValMock.value()).thenReturn("testValue\uFFFF");
            urlBuilder.appendKeyVal(keyValMock);
        } catch (MalformedURLException mue) {
            fail(mue.getMessage());
        }
    }

}