package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class GeneratedTestBuildUrl {

    @Test
    public void testBuildUrl() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(mock(URL.class));
        when(urlBuilder.build()).thenReturn(new URISyntaxException(inputUrl, 0));
        String expectedOutput = "https://example.com/path?param1=value1&param2=value2";
        String actualOutput = urlBuilder.build();
        assertEquals(expectedOutput, actualOutput);
    }

}