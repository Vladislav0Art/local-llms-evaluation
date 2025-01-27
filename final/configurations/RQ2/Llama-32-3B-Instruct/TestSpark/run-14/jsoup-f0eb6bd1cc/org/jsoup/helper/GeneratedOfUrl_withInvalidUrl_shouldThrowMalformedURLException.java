package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedOfUrl_withInvalidUrl_shouldThrowMalformedURLException {

    private static final String DEFAULT_URL = "https://example.com";

    @Test
    public void ofUrl_withInvalidUrl_shouldThrowMalformedURLException() {
        // Arrange and Act and Assert
        org.junit.Assert.assertThrows(MalformedURLException.class, () -> new UrlBuilder(new URL("invalid://url")));
    }

}