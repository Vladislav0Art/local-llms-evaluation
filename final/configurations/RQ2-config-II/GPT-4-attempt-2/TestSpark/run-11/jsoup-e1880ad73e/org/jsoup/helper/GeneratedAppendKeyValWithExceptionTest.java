package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValWithExceptionTest {

    @Test
    public void appendKeyValWithExceptionTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("testKey");
        Mockito.when(keyVal.value()).thenReturn("\uD800"); // surrogate pair triggers the exception
        urlBuilder.appendKeyVal(keyVal);
    }

}