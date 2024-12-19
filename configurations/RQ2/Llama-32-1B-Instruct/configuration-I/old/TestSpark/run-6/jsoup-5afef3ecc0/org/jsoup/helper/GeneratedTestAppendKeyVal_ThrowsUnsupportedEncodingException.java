package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal_ThrowsUnsupportedEncodingException {

    @Test
    public void testAppendKeyVal_ThrowsUnsupportedEncodingException() {
        // Arrange
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        Mockito.when(inputUrl.getQuery()).thenReturn(null);
        Mockito.when(inputUrl.getFragment()).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }

        // Assert
        assertEquals(0, actual.length()); // Should not throw UnsupportedEncodingException
    }

}