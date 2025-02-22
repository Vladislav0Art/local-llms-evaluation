package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection.KeyVal;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        // Create a new UrlBuilder object
        urlBuilder = new UrlBuilder(mock(URL.class));
    }

    @Test
    public void testBuild_NoQueryString() {
        // Set up test data
        String expectedResult = "http://www.example.com";
        urlBuilder.u = mock(URL.class);
        when(urlBuilder.u.getProtocol()).thenReturn("http");
        when(urlBuilder.u.getUserInfo()).thenReturn(null);
        when(urlBuilder.u.getHost()).thenReturn("www.example.com");
        when(urlBuilder.u.getPort()).thenReturn(-1);
        when(urlBuilder.u.getPath()).thenReturn("");
        when(urlBuilder.u.getRef()).thenReturn(null);

        // Execute the method
        URL actualResult = urlBuilder.build();

        // Verify the result
        assertEquals(expectedResult, actualResult.toString());
    }

}