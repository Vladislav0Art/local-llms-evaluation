package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.jsoup.helper.UrlBuilder.*;
import static org.mockito.Mockito.*;

public class GeneratedTestBuildWithoutQueryParams {

    @Test
    public void testBuildWithoutQueryParams() {
        // Arrange
        String inputUrl = "https://example.com/path/to/resource";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder();
        when(urlBuilder.appendKeyVal(null)).thenReturn(true);

        URL actualOutput = urlBuilder.build();

        // Assert
        assertNotNull(actualOutput);
        assertEquals(expectedOutput, new URI(actualOutput).getScheme() + "://" + actualOutput.getAuthority());
    }

}