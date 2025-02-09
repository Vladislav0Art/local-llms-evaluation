package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValValidArgumentTest {

    private URL validUrl;

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void appendKeyValValidArgumentTest() throws MalformedURLException, UnsupportedEncodingException {
        validUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(validUrl);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");
        urlBuilder.appendKeyVal(keyVal);
    }

}