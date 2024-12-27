package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private URL inputUrl;

    @Test
    public void buildTest() throws MalformedURLException {
        when(inputUrl.toString()).thenReturn("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertEquals("http://www.example.com", result.toString());
    }

    @Test
    public void buildTest_MalformedURLException() throws MalformedURLException {
        when(inputUrl.toString()).thenReturn("invalid url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        when(inputUrl.toString()).thenReturn("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL result = urlBuilder.build();
        assertEquals("http://www.example.com?key=value", result.toString());
    }

}