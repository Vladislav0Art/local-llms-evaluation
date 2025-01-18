package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTestValidData {

    @Test
    public void appendKeyValTestValidData() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
            when(keyVal.key()).thenReturn("key");
            when(keyVal.value()).thenReturn("value");
            urlBuilder.appendKeyVal(keyVal);
            URL result = urlBuilder.build();
            assertNotNull(result);
            assertEquals("http", result.getProtocol());
            assertEquals("example.com", result.getHost());
            assertTrue(result.getQuery().contains("key=value"));
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            fail("Unexpected exception was thrown: " + e.getMessage());
        }
    }

}