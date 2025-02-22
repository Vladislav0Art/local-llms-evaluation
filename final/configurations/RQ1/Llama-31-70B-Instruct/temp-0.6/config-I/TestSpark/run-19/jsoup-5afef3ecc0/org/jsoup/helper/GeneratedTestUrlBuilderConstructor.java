package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.jsoup.Connection;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.net.MalformedURLException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestUrlBuilderConstructor {

    private UrlBuilder urlBuilder;
    private URL url;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void testUrlBuilderConstructor() {
        assertEquals(urlBuilder.u, url);
    }

}