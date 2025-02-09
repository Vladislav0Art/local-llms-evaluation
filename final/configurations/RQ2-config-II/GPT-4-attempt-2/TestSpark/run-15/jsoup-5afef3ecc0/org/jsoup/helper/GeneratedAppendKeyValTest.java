package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal mockedKeyVal = mock(Connection.KeyVal.class);
        Mockito.when(mockedKeyVal.key()).thenReturn("testKey");
        Mockito.when(mockedKeyVal.value()).thenReturn("testValue");
        builder.appendKeyVal(mockedKeyVal);
        URL outputUrl = builder.build();
        assertNotNull(outputUrl);
    }

}