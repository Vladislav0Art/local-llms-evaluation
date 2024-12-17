package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrl_WithDefaultInputUrl_ReturnsSameUrl {

    @Mock
    private Connection connection;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buildUrl_WithDefaultInputUrl_ReturnsSameUrl() {
        when(connection.getUrl()).thenReturn(new URL("https://www.example.com"));
        String expectedUrl = "https://www.example.com";
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl.toString());
    }

}