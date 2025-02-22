package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestBuild_whenUrlIsNull {

    @Test
    public void testBuild_whenUrlIsNull() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // Act
        URL url = urlBuilder.build();

        // Assert
        assertNull(url);
    }

}