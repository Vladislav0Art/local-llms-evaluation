package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValInvalidEncodingTest {

    @Test
    public void appendKeyValInvalidEncodingTest() throws UnsupportedEncodingException {
        URL initialUrl;
        try {
            initialUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(initialUrl);
            Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(keyVal.key()).thenReturn("key░");
            Mockito.when(keyVal.value()).thenReturn("value");
            urlBuilder.appendKeyVal(keyVal);
        } catch (MalformedURLException e) {
            Assert.fail();
        }
    }

}