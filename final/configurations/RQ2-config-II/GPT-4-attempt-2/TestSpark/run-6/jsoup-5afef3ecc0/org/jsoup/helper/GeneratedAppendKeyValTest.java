package org.jsoup.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("http://test.url");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        when(mockKeyVal.key()).thenReturn("key");
        when(mockKeyVal.value()).thenReturn("value");
        builder.appendKeyVal(mockKeyVal);
        URL buildUrl = builder.build();
        assertTrue("Url should contain appended key-value pair",
                buildUrl.getQuery().contains("key=value"));
    }

}