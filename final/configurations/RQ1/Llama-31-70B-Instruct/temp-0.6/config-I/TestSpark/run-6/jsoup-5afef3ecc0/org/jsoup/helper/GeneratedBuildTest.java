package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Mock
    private URL inputUrl;

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        // Arrange
        MockitoAnnotations.initMocks(this);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        URL result = builder.build();

        // Assert
        assertNotNull(result);
    }

}