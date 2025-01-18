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
public class GeneratedAppendKeyValTestInvalidData {

    @Test
    public void appendKeyValTestInvalidData() throws UnsupportedEncodingException {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
            when(keyVal.key()).thenReturn("key");
            when(keyVal.value()).thenReturn("\uD800\uDC00");
            urlBuilder.appendKeyVal(keyVal);
        } catch (MalformedURLException e) {
            fail("Unexpected exception was thrown: " + e.getMessage());
        }
    }

}