package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.jsoup.helper.UrlBuilder.*;
import static org.mockito.Mockito.*;

public class GeneratedTestBuildWithoutQueryParamsWithUrlAndValues {

    @Test
    public void testBuildWithoutQueryParamsWithUrlAndValues() {
        // Arrange
        String inputUrl = "https://example.com/path/to/resource?param1=value1&param2=value2";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder();
        when(urlBuilder.appendKeyVal(new org.jsoup.helper.KeyValueMap("param1", "value1"))).thenReturn(true);
        when(urlBuilder.appendKeyVal(new org.jsoup.helper.KeyValueMap("param2", "value2"))).thenReturn(true);

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