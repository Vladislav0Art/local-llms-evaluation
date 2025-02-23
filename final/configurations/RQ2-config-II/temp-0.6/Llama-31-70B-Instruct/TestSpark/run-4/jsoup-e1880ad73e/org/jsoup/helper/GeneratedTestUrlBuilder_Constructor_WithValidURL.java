package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestUrlBuilder_Constructor_WithValidURL {

    // Tests for the UrlBuilder(URL) constructor

    @Test
    public void testUrlBuilder_Constructor_WithValidURL() throws MalformedURLException {
        URL url = new URL("https://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.u);
        assertNull(urlBuilder.q);
    }

}