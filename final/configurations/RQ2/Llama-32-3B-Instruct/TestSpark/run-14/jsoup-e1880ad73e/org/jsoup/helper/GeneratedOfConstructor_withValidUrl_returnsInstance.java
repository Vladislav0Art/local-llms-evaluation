package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOfConstructor_withValidUrl_returnsInstance {

    @Mock
    private Connection connection;

    @Test
    public void ofConstructor_withValidUrl_returnsInstance() {
        URL url = Mockito.mock(URL.class);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Mockito.verify(url).equals(url);
    }

}