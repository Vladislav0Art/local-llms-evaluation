package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValToUrlTest {

    @Test
    public void appendKeyValToUrlTest() throws Exception {
        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        when(mockKeyVal.key()).thenReturn("key");
        when(mockKeyVal.value()).thenReturn("value");

        URL emptyUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(emptyUrl);
        urlBuilder.appendKeyVal(mockKeyVal);

        String expectedKey = URLEncoder.encode(mockKeyVal.key(), "utf-8");
        String expectedValue = URLEncoder.encode(mockKeyVal.value(), "utf-8");

        URL expectedUrl = new URL("http://www.example.com/?" + expectedKey + "=" + expectedValue);
        assertEquals(expectedUrl, urlBuilder.build());
    }

}