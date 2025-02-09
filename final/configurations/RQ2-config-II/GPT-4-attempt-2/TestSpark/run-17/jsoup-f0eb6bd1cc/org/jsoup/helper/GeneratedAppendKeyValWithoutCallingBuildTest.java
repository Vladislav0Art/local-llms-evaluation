package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWithoutCallingBuildTest {

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void appendKeyValWithoutCallingBuildTest() throws UnsupportedEncodingException {
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(keyVal);
    }

}