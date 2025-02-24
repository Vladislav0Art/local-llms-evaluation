package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlTest {

    @Mock
    URL inputUrl;

    @Test
    public void buildUrlTest() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedURL = "https://www.example.com";

        // Act
        URL actualURL = urlBuilder.build();

        // Assert
        assertEquals(expectedURL, actualURL.toString());
    }

}