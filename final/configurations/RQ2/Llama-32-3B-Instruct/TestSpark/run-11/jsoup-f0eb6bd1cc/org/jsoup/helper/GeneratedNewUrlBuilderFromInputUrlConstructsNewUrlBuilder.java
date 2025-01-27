package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedNewUrlBuilderFromInputUrlConstructsNewUrlBuilder {

    @Test
    public void newUrlBuilderFromInputUrlConstructsNewUrlBuilder() {
        // Arrange & Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));

        // Assert
        assertNotNull(urlBuilder);
    }

}