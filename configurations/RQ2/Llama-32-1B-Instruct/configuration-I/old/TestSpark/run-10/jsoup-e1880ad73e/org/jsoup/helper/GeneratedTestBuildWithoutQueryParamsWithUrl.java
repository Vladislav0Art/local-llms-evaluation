package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.jsoup.helper.UrlBuilder.*;
import static org.mockito.Mockito.*;

public class GeneratedTestBuildWithoutQueryParamsWithUrl {

    @Test
    public void testBuildWithoutQueryParamsWithUrl() {
        // Arrange
        String inputUrl = "https://example.com/path/to/resource";

        // Act
        UrlBuilder urlBuilder = mock(UrlBuilder.class);
        when(urlBuilder.appendKeyVal(null)).thenReturn(true);

        try {
            URL actualOutput = urlBuilder.build();
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            verifyNoMoreInteractions(urlBuilder, null, String.class, String.class);
        }

        // Assert
        assertNotNull(actualOutput);
        assertEquals(expectedOutput, new URI(actualOutput).getScheme() + "://" + actualOutput.getAuthority());
    }

}