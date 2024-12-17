package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuild_url_with_params {

    @Test
    public void build_url_with_params() {
        // Arrange
        String url = "https://example.com";
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.build()).thenReturn(url);
    }

}