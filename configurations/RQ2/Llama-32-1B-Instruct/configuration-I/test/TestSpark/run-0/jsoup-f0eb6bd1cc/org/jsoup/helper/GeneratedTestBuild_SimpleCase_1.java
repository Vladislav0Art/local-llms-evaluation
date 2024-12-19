package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Map;
import java.net.URISyntaxException;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Connection.KeyVal;
import org.mockito.Mockito;

public class GeneratedTestBuild_SimpleCase_1 {

    @Test
    public void testBuild_SimpleCase_1() {
        final String inputUrl = "https://example.com";
        final URI url = new URI(inputUrl);

        // Test case 1: appendKeyVal with no arguments
        when(url.getHost()).thenReturn(null);

        try {
            final Map<String, String> expectedOutput = new java.util.HashMap<>();
            expectedOutput.put("host", null);
            expectedOutput.put("port", null);
            expectedOutput.put("path", "");
            expectedOutput.put("query", "");
            expectedOutput.put("fragment", "");
            assertEquals(expectedOutput, urlBuilder.build());
        } catch (URISyntaxException e) {
        }
    }

}