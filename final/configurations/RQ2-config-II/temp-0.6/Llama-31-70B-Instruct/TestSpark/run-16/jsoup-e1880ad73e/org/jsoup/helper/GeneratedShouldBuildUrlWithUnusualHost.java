package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldBuildUrlWithUnusualHost {

    @Test
    public void shouldBuildUrlWithUnusualHost() throws Exception {
        // Given
        URL inputUrl = new URL("https://example.com/path?key=value#fragment");
        URLBuilder urlBuilder = new URLBuilder(inputUrl);

        // When
        URL builtUrl = urlBuilder.build();

        // Then
        assertEquals("https://xn--example-hva.com/path?key=value#fragment", builtUrl.toString());
    }

}