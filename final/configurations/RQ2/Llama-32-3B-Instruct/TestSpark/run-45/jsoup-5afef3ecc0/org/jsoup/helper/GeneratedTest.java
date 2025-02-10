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
public class GeneratedTest {

    @Mock
    private Connection connection;

    @Before
    public void setUp() {
        // Setup necessary objects here.
    }

    @Test
    public void ofUrl

    BuildsUrl() {
        // Given: url to build from
        URL inputUrl = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // When: Build the url
        URL actualUrl = builder.build();

        // Then: The resulting url is correct
        assertNotNull(actualUrl);
    }

    @Test
    public void appendKeyValWithNullThrowsUnsupportedEncodingException() {
        // Given: null key value pair
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));

        // When: Append null key value pair
        try {
            builder.appendKeyVal(null);
            assertTrue(false); // Should not reach here
        } catch (UnsupportedEncodingException e) {
            // Then: The exception is thrown as expected
        }
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

    @Test
    public void appendKeyValWithValidKeyAndValue() {
        // Given: valid key value pair
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        String key = "key";
        String value = "value";

        when(kv.getKey()).thenReturn(key);
        when(kv.getValue()).thenReturn(value);

        // When: Append valid key and value
        builder.appendKeyVal(kv);

        // Then: The resulting url is correct
    }

    @Test
    public void appendQueryParameter() {
        // Given: url to build from and query parameter
        URL inputUrl = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        String key = "key";
        String value = "value";

        // When: Append key value pair to the url
        builder.appendKeyVal(new Connection.KeyVal(key, value));

        // Then: The resulting url is correct
    }

    @Test
    public void appendFragment() {
        // Given: url to build from and fragment
        URL inputUrl = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        String fragment = "#fragment";

        // When: Append key value pair to the url with a fragment
        builder.appendKeyVal(new Connection.KeyVal("#", fragment));

        // Then: The resulting url is correct
    }

}