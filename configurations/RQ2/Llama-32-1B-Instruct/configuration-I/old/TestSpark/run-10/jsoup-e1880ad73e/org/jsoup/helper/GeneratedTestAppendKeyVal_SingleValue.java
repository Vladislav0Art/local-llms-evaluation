package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.jsoup.helper.UrlBuilder.*;
import static org.mockito.Mockito.*;

public class GeneratedTestAppendKeyVal_SingleValue {

    @Test
    public void testAppendKeyVal_SingleValue() {
        // Arrange
        String inputUrl = "https://example.com/path/to/resource?param1=value1";

        // Act
        UrlBuilder urlBuilder = mock(UrlBuilder.class);
        when(urlBuilder.appendKeyVal(new org.jsoup.helper.KeyValueMap("param1", "value1"))).thenReturn(true);

        URL actualOutput = urlBuilder.build();

        // Assert
        assertNotNull(actualOutput);
        assertEquals(expectedOutput, new URI(actualOutput).getScheme() + "://" + actualOutput.getAuthority());
    }

}