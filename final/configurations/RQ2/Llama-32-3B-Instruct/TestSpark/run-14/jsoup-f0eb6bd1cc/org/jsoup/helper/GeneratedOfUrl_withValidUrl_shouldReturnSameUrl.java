package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedOfUrl_withValidUrl_shouldReturnSameUrl {

    private static final String DEFAULT_URL = "https://example.com";

    @Test
    public void ofUrl_withValidUrl_shouldReturnSameUrl() {
        // Arrange and Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL(DEFAULT_URL));
        String actual = urlBuilder.build().toString();

        // Assert
        org.junit.Assert.assertEquals(DEFAULT_URL, actual);
    }

}