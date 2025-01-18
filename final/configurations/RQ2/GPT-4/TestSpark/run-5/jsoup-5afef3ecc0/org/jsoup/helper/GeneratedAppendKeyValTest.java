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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Mock
    private Connection.KeyVal mockedKeyVal;

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        when(mockedKeyVal.key()).thenReturn("key");
        when(mockedKeyVal.value()).thenReturn("value");

        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com"));
        urlBuilder.appendKeyVal(mockedKeyVal);
        URL builtUrl = urlBuilder.build();

        assertTrue(builtUrl.toString().contains("key=value"));
    }

}