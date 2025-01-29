package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class GeneratedTestBuild {

    @Mock
    private Connection.KeyVal keyVal;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void testBuild() {
        // Arrange
        URL inputUrl = "https://example.com";
        when(keyVal.getEncoding()).thenReturn("UTF-8");

        // Act and Assert
        URL expectedUrl = new URL("https://example.com");
        assertTrue(urlBuilder.build().equals(expectedUrl));
    }

}