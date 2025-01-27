package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
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

import static org.jsoup.helper.DataUtil.UTF_8;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrl {

    @Mock
    private Connection connection;

    @Test
    public void buildUrl() {
        // Given: mock the input URL
        Mockito.when(connection.getUrl()).thenReturn("https://www.example.com");

        // When: call the build method on the url builder
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        URL result = urlBuilder.build();

        // Then: verify that the output URL is correct
        String expectedUrl = "https://www.example.com";
        Mockito.verify(result, Mockito.times(1)).toURI();
        assert StringUtil.equals(expectedUrl, DataUtil.urlToString(result));
    }

}