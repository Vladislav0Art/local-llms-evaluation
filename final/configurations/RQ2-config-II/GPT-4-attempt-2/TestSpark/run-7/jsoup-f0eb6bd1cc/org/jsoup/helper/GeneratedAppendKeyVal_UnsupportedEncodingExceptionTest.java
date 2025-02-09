package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyVal_UnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyVal_UnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        URL url = null;
        try {
            url = new URL("https://www.example.com");
            Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
            when(keyValMock.key()).thenReturn("?param");
            when(keyValMock.value()).thenReturn("value");

            UrlBuilder builder = new UrlBuilder(url);
            builder.appendKeyVal(keyValMock); // this should cause UnsupportedEncodingException
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

}