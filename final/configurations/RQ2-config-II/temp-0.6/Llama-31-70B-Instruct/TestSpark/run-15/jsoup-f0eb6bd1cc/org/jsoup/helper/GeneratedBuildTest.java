package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.After;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.net.URI;

import org.junit.BeforeClass;
import org.junit.AfterClass;

public class GeneratedBuildTest {

    private UrlBuilder urlBuilder;
    private URL url;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void buildTest() {
        // Arrange
        urlBuilder.u = new URL("http://www.example.com");
        // Act
        URL result = urlBuilder.build();
        // Assert
        assertEquals("http://www.example.com", result.toString());
    }

}