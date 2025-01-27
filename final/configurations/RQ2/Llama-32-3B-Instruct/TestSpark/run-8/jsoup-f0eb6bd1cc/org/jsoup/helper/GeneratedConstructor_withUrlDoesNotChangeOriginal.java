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
public class GeneratedConstructor_withUrlDoesNotChangeOriginal {

    @Mock
    private Connection connection;

    @Test
    public void constructor_withUrlDoesNotChangeOriginal() {
        // Arrange
        URL url = new URL("http://example.com");
        when(connection.getScheme()).thenReturn("http");

        // Act
        UrlBuilder builder = new UrlBuilder(url);

        // Assert
        assertEquals(url, connection);
    }

}