package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWithValidKeyValTest {

    @Mock
    private URL mockUrl;

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void appendKeyValWithValidKeyValTest() throws UnsupportedEncodingException {
        when(mockKeyVal.key()).thenReturn("key");
        when(mockKeyVal.value()).thenReturn("value");

        UrlBuilder urlBuilder = new UrlBuilder(mockUrl);
        urlBuilder.appendKeyVal(mockKeyVal);
    }

}