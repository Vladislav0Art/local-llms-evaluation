package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        // Given
        URL inputUrl = new URL("http://www.example.com/test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");

        // When
        urlBuilder.appendKeyVal(kv);

        // Then
        assertEquals("?key=value", urlBuilder.q.toString());
    }

}