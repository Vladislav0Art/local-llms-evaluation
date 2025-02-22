package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_WithQuery_ReturnsUrlWithQuery {

    private UrlBuilder urlBuilder;

    @Mock
    private URL mockUrl;

    @Before
    public void setUp() throws MalformedURLException {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void build_WithQuery_ReturnsUrlWithQuery() throws Exception {
        // Arrange
        StringBuilder queryBuilder = new StringBuilder("key1=value1&key2=value2");

        // Act
        URL actualUrl = urlBuilder.build();

        // Assert
        assertEquals("key1=value1&key2=value2", actualUrl.getQuery());
    }

}