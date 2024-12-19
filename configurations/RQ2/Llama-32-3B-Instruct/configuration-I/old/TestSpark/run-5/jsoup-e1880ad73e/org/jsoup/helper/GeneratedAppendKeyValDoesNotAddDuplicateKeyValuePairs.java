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
public class GeneratedAppendKeyValDoesNotAddDuplicateKeyValuePairs {

    @Mock
    private Connection connection;

    @Mock
    private URL inputUrl;

    @org.junit.Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyValDoesNotAddDuplicateKeyValuePairs() {
        urlBuilder = new UrlBuilder(inputUrl);

        when(connection.getKey()).thenReturn("key");
        when(connection.getValue()).thenReturn("value");

        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));

        assertEquals("key=value", new java.net.URL(urlBuilder.build()).getQuery());
    }

}