package org.jsoup.helper;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import org.jsoup.Connection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlWithoutQueryTest {

    @Mock
    private URL inputUrl;

    private UrlBuilder urlBuilder;

    @Before
    public void setup() throws MalformedURLException {
        when(inputUrl.getProtocol()).thenReturn("http");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/path");
        when(inputUrl.getQuery()).thenReturn("key=value");
        when(inputUrl.getRef()).thenReturn("fragment");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildUrlWithoutQueryTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        when(inputUrl.getQuery()).thenReturn(null);
        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals("http://example.com/path#fragment", builtUrl.toString());
    }

}