package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal {

    @Mock
    private URL mockedUrl;

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        when(mockedUrl.getHost()).thenReturn("example.com");
        UrlBuilder urlBuilder = new UrlBuilder(mockedUrl);
        urlBuilder.appendKeyVal("key", "value");
        URL url = urlBuilder.build();
        assertEquals("key=value", url.getQuery());
    }

}