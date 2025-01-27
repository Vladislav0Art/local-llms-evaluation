package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_urlWithoutFragment {

    @Mock
    private Connection connection;

    @Test
    public void build_urlWithoutFragment() {
        // Arrange
        String url = "http://example.com";
        when(connection.getScheme()).thenReturn("http");
        when(connection.getFragment()).thenReturn(null);
        when(connection.getQuery()).thenReturn("key=value");

        UrlBuilder builder = new UrlBuilder(new URL(url));

        // Act
        URL result = builder.build();

        // Assert
        assertEquals("http://example.com", result.toString());
    }

}