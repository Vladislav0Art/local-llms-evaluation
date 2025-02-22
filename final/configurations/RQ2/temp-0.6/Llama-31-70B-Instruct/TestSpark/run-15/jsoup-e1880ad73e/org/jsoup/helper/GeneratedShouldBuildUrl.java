package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedShouldBuildUrl {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(mock(URL.class));
    }

    @Test
    public void shouldBuildUrl() {
        URL expectedUrl = mock(URL.class);
        when(urlBuilder.build()).thenReturn(expectedUrl);

        URL actualUrl = urlBuilder.build();

        assertEquals(expectedUrl, actualUrl);
    }

}