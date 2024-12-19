package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTestAppendKeyVal_WithUnsupportedEncodingException {

    @Test
    public void testAppendKeyVal_WithUnsupportedEncodingException() {
        // Create a MockConnection object with the required connection details
        MockConnection mockConn = Mockito.mock(MockConnection.class);

        // Set up the expected output when appendKeyVal is called with an UnsupportedEncodingException
        Exception exception = new java.net.UnsupportedEncodingException("UTF-8");
        Mockito.when(mockConn.getKeyValue()).thenReturn(keyValStr);
        Mockito.whenExceptionCaught(() -> exception);

        UrlBuilder builder = new UrlBuilder(mockConn);
        try {
            builder.appendKeyVal(new java.util.HashMap<>());
            fail("Expected an UnsupportedEncodingException to be thrown");
        } catch (Exception e) {
            // Expected exception
        }

        URL url = builder.appendKeyVal(new java.util.HashMap<>());
        assertEquals("https://example.com/path?key=val", url.toString());
    }

}