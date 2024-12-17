package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuild_url_no_params {

    @Test
    public void build_url_no_params() {
        // Arrange
        String url = "https://example.com";
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.build()).thenReturn(url);
        assertEquals(url, urlObject.toString());
    }

}