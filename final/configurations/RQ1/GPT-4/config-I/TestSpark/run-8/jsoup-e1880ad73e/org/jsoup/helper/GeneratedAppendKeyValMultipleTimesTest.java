package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedAppendKeyValMultipleTimesTest {

    @Test
    public void appendKeyValMultipleTimesTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        //mocking KeyVal object
        Connection.KeyVal keyValOne = Mockito.mock(Connection.KeyVal.class);
        when(keyValOne.key()).thenReturn("keyOne");
        when(keyValOne.value()).thenReturn("valueOne");

        Connection.KeyVal keyValTwo = Mockito.mock(Connection.KeyVal.class);
        when(keyValTwo.key()).thenReturn("keyTwo");
        when(keyValTwo.value()).thenReturn("valueTwo");

        urlBuilder.appendKeyVal(keyValOne);
        urlBuilder.appendKeyVal(keyValTwo);

        Assert.assertTrue(urlBuilder.u.toString().contains("?keyOne=valueOne&keyTwo=valueTwo"));
    }

}