package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private URL mockUrl;

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        when(mockUrl.getProtocol()).thenReturn("https");
        when(mockUrl.getHost()).thenReturn("www.example.com");
        when(mockUrl.getPath()).thenReturn("/path/to/resource");
        when(mockUrl.getQuery()).thenReturn("key1=value1&key2=value2");
        when(mockUrl.getRef()).thenReturn("fragment");
        urlBuilder = new UrlBuilder(mockUrl);
    }

    @Test
    public void shouldBuildUrl() {
        URL url = urlBuilder.build();
        assertEquals("https://www.example.com/path/to/resource?key1=value1&key2=value2#fragment", url.toString());
    }

    @Test
    public void shouldAppendKeyValue() throws UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key3", "value3"));
        URL url = urlBuilder.build();
        assertEquals("https://www.example.com/path/to/resource?key1=value1&key2=value2&key3=value3#fragment", url.toString());
    }

}