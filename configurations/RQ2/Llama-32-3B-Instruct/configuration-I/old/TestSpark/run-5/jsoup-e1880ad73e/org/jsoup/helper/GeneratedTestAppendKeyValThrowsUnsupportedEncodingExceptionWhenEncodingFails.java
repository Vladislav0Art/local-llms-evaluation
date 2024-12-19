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
public class GeneratedTestAppendKeyValThrowsUnsupportedEncodingExceptionWhenEncodingFails {

    private UrlBuilder urlBuilder;

    @org.junit.Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    public UrlBuilder getUrlBuilder() {
        return urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testAppendKeyValThrowsUnsupportedEncodingExceptionWhenEncodingFails() throws UnsupportedEncodingException {
        urlBuilder = getUrlBuilder();

        when(connection.getKey()).thenReturn("key");
        when(connection.getValue()).thenReturn("value");

        // Make the encoding fail for testing purposes
        Base64.getEncoder().encodeToString("key").getBytes()[0] = 10;

        assertTrue(() -> urlBuilder.appendKeyVal(new Connection.KeyVal(null, null))).toThrow(UnsupportedEncodingException.class);
    }

}