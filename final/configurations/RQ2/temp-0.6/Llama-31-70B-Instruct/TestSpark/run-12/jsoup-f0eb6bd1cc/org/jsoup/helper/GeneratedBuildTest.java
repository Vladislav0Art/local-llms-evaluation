package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

public class GeneratedBuildTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
    }

    @Test
    public void buildTest() {
        URL expectedUrl = Mockito.mock(URL.class);
        Mockito.when(urlBuilder.build()).thenReturn(expectedUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

}