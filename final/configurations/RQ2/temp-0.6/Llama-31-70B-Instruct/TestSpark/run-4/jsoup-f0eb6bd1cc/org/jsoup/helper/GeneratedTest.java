package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void shouldBuildNormalizedUrl() throws MalformedURLException {
        // Given
        URL inputUrl = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When
        URL normalizedUrl = urlBuilder.build();

        // Then
        Assert.assertEquals("http://example.com/path?query=value#fragment", normalizedUrl.toString());
    }

}