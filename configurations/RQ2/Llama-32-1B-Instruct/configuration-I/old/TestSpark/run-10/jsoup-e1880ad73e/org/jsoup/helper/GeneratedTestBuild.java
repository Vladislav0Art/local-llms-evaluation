package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.jsoup.helper.UrlBuilder.*;
import static org.mockito.Mockito.*;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        // Arrange
        String inputUrl = "https://example.com/path/to/resource?param1=value1&param2=value2";
        URL url = new URI(inputUrl);

        // Act
        UrlBuilder urlBuilder = mock(UrlBuilder.class);
        for (Map.Entry<String, String> entry : url.getQueryParameters().entrySet()) {
            when(urlBuilder.appendKeyVal(entry)).thenReturn(true);
        }
        String expectedOutput = "https://example.com/path/to/resource?param1=value1&param2=value2";
        URL actualOutput = urlBuilder.build();

        // Assert
        assertNotNull(actualOutput);
        assertEquals(expectedOutput, new URI(actualOutput).getScheme() + "://" + actualOutput.getAuthority());
    }

}