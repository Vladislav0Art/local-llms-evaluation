package org.jsoup.helper;

import org.jsoup.Connection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWithNonNullQTest {

    @Test
    public void appendKeyValWithNonNullQTest() throws Exception {
        URL url = new URL("http://www.google.com?q=someText");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("newKey");
        when(keyVal.value()).thenReturn("newValue");

        urlBuilder.appendKeyVal(keyVal);
        assertEquals("q=someText&newKey=newValue", StringUtil.releaseBuilder(urlBuilder.q));
    }

}