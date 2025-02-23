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

public class GeneratedDecodePartTest {

    private UrlBuilder urlBuilder;
    private URL url;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void decodePartTest() {
        // Arrange
        String encoded = "abc%20def";
        // Act
        String result = UrlBuilder.decodePart(encoded);
        // Assert
        assertEquals("abc def", result);
    }

}