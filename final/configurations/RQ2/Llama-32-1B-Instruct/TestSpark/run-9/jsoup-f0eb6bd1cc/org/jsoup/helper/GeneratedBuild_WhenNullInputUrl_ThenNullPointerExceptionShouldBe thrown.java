package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedBuild_WhenNullInputUrl_ThenNullPointerExceptionShouldBe thrown {

    private UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void build_WhenNullInputUrl_ThenNullPointerExceptionShouldBe

    thrown() {
        // Arrange
        String url = null;

        // Act & Assert
		.expectThrow(UnsupportedEncodingException.class)
                .when(urlBuilder.build());
    }

}