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

public class GeneratedTestAppendKeyVal_WithEmptyString {

    @Mock
    private Connection.KeyVal keyVal;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void testAppendKeyVal_WithEmptyString() {
        // Arrange
        String[] keyValues = {};
        URL inputUrl = new URL("https://example.com");

        // Act and Assert
        boolean added = false;
        for (int i = 0; i < keyValues.length; i++) {
            assertEquals(added, urlBuilder.appendKeyVal(inputUrl, keyValues[i]));
            add assertion, assertEquals (1, i);
            added = true;
        }
    }

}