package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;

public class GeneratedNewUrlBuilderFromInputUrl ConstructsNewUrlBuilder {

    @Test
    public void newUrlBuilderFromInputUrl

    ConstructsNewUrlBuilder() {
        // Arrange & Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));

        // Assert
        assertNotNull(urlBuilder);
    }

}