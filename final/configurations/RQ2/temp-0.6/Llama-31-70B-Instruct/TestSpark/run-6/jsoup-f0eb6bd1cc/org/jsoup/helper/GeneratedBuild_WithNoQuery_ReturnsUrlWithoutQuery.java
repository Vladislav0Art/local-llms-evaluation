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
public class GeneratedBuild_WithNoQuery_ReturnsUrlWithoutQuery {

    private UrlBuilder urlBuilder;

    @Mock
    private URL mockUrl;

    @Before
    public void setUp() throws MalformedURLException {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void build_WithNoQuery_ReturnsUrlWithoutQuery() throws Exception {
        // Arrange
        when(mockUrl.getQuery()).thenReturn(null);

        // Act
        URL actualUrl = urlBuilder.build();

        // Assert
        assertEquals("http://example.com", actualUrl.toString());
    }

}