package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private URL inputUrl;

    @Test
    public void testBuild_withQuery() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        when(inputUrl.getProtocol()).thenReturn("https");
        when(inputUrl.getUserInfo()).thenReturn("user:info");
        when(inputUrl.getHost()).thenReturn("host");
        when(inputUrl.getPort()).thenReturn(8080);
        when(inputUrl.getPath()).thenReturn("/path");
        when(inputUrl.getQuery()).thenReturn("query=value");
        when(inputUrl.getRef()).thenReturn("fragment");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("https://user:info@host:8080/path?query=value#fragment", outputUrl.toExternalForm());
    }

}