package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        // Arrange
        String inputUrl = "http://jsoup.org";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        String outputUrl = urlBuilder.build();

        // Assert
        assertEquals("http://jsoup.org", outputUrl);
    }

}