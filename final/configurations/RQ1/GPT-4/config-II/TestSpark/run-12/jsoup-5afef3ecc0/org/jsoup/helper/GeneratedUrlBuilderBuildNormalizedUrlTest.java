package org.jsoup.helper;

import org.jsoup.Connection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderBuildNormalizedUrlTest {

    @Test
    public void UrlBuilderBuildNormalizedUrlTest() throws Exception {
        URL url = new URL("http://www.google.com?q=someText");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL normalizedUrl = urlBuilder.build();
        assertEquals("http://www.google.com?q=someText+", normalizedUrl.toString());
    }

}