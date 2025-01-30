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

public class GeneratedAppendKeyValNonEnglishTest {

    @Test
    public void appendKeyValNonEnglishTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        //mocking KeyVal object
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("ключ");
        when(keyVal.value()).thenReturn("значение");

        urlBuilder.appendKeyVal(keyVal);
        Assert.assertTrue(urlBuilder.u.toString().contains("?%D0%BA%D0%BB%D1%8E%D1%87=%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D0%B5"));
    }

}