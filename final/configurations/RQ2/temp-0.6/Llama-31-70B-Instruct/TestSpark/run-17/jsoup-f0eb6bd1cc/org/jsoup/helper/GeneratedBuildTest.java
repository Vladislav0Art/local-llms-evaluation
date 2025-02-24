package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Mock
    private URL inputUrl;

    @Test
    public void buildTest() throws Exception {
        when(inputUrl.getProtocol()).thenReturn("http");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPort()).thenReturn(-1);
        when(inputUrl.getPath()).thenReturn("/");

        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();

        assertEquals("http://example.com/", url.toString());
    }

}