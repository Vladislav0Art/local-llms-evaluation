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
public class GeneratedBuildUrlWithQuery {

    @Mock
    private Connection connection;

    @Test
    public void buildUrlWithQuery() {
        // Given: mock the input URL with a query string
        Mockito.when(connection.getUrl()).thenReturn("https://www.example.com?query=string");

        // When: call the build method on the url builder
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        URL result = urlBuilder.build();

        // Then: verify that the output URL is correct
        String expectedUrl = "https://www.example.com?query=string";
        Mockito.verify(result, Mockito.times(1)).toURI();
        assert StringUtil.equals(expectedUrl, DataUtil.urlToString(result));
    }

}