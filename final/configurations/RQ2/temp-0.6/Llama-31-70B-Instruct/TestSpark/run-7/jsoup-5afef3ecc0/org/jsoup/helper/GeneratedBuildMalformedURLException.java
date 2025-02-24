package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildMalformedURLException {

    @Test
    public void buildMalformedURLException() throws Exception {
        // Arrange
        URL inputUrl = new URL("invalid url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        urlBuilder.build();
    }

}