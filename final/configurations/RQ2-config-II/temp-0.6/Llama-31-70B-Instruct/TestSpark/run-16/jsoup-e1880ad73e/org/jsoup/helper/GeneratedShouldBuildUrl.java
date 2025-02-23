package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldBuildUrl {

    @Test
    public void shouldBuildUrl() throws Exception {
        // Given
        URL inputUrl = new URL("https://example.com/path?key=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When
        URL builtUrl = urlBuilder.build();

        // Then
        assertEquals("https://xn--example-hva.com/path?key=value#fragment", builtUrl.toString());
    }

}