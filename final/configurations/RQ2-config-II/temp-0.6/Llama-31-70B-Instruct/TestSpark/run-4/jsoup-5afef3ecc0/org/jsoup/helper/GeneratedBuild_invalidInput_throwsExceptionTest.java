package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedBuild_invalidInput_throwsExceptionTest {

    @Test
    public void build_invalidInput_throwsExceptionTest() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL outputUrl = urlBuilder.build();
    }

}