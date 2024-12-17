package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.util.Base64;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestBuildUrlReturnsUrl {

    private UrlBuilder urlBuilder;

    @org.junit.Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    public UrlBuilder getUrlBuilder() {
        return urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testBuildUrlReturnsUrl() {
        urlBuilder = getUrlBuilder();

        when(connection.getKey()).thenReturn("key");
        when(connection.getValue()).thenReturn("value");

        URL result = urlBuilder.build();
        assertNotNull(result);

        // Test if the resulting URL has the correct key-value pair
        String encodedKey = Base64.getEncoder().encodeToString(connection.getKey());
        String encodedValue = Base64.getEncoder().encodeToString(connection.getValue());

        assertEquals(encodedKey, new java.net.URL(result).getQuery());
        assertEquals(encodedValue, new java.net.URL(result).getQuery());
    }

}