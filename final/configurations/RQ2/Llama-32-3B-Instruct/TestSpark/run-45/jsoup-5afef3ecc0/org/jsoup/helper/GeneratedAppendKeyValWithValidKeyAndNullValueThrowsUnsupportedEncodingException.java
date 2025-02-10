package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWithValidKeyAndNullValueThrowsUnsupportedEncodingException {

    @Mock
    private Connection connection;

    @Before
    public void setUp() {
        // Setup necessary objects here.
    }

    @Test
    public void appendKeyValWithValidKeyAndNullValueThrowsUnsupportedEncodingException() {
        // Given: valid key value pair but null value
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);

        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenThrow(UnsupportedEncodingException.class);

        // When: Append valid key and null value
        try {
            builder.appendKeyVal(kv);
            assertTrue(false); // Should not reach here
        } catch (UnsupportedEncodingException e) {
            // Then: The exception is thrown as expected
        }
    }

}