package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class GeneratedTestBuildUrl_NullUrl {

    @Test
    public void testBuildUrl_NullUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        when(urlBuilder.build()).thenReturn(new URISyntaxException("https://example.com/path?param1=value1&param2=value2", 0));
        String expectedOutput = "https://example.com/path?param1=value1&param2=value2";
        String actualOutput = urlBuilder.build();
        assertEquals(expectedOutput, actualOutput);
    }

}