package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void buildUrlTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://example.com");
        urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertEquals(inputUrl, result);
    }

    @Test
    public void buildUrlNullInputTest() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

}