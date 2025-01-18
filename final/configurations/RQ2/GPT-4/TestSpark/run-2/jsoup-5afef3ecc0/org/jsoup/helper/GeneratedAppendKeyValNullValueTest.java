package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValNullValueTest {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void appendKeyValNullValueTest() throws UnsupportedEncodingException, MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://google.com"));
        when(mockKeyVal.key()).thenReturn("testKey");
        when(mockKeyVal.value()).thenReturn(null);
        urlBuilder.appendKeyVal(mockKeyVal);
    }

}