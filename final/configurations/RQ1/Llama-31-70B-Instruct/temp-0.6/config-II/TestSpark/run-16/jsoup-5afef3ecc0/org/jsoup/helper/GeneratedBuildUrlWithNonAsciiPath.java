package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlWithNonAsciiPath {

    @Mock
    private URL inputUrl;

    @Test
    public void buildUrlWithNonAsciiPath() throws URISyntaxException, MalformedURLException {
        // Arrange
        when(inputUrl.getPath()).thenReturn("path with non-ascii characters: 😊");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals("path%20with%20non-ascii%20characters:%20%F0%9F%98%8A", result.getPath());
    }

}