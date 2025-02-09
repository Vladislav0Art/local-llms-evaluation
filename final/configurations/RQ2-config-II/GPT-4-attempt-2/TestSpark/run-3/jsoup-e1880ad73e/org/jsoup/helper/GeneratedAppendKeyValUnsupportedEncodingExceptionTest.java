package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.key()).thenReturn("123");
        when(keyValMock.value()).thenReturn("\uFFFF");
        urlBuilder.appendKeyVal(keyValMock);
    }

}