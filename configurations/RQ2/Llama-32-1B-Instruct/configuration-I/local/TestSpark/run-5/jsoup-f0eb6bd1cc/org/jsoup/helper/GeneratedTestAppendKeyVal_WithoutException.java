package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTestAppendKeyVal_WithoutException {

    @Test
    public void testAppendKeyVal_WithoutException() {
        // Create a MockConnection object with the required connection details
        MockConnection mockConn = Mockito.mock(MockConnection.class);

        // Set up the expected output when appendKeyVal is called
        String keyValStr = "key=val";
        Mockito.when(mockConn.getKeyValue()).thenReturn(keyValStr);

        UrlBuilder builder = new UrlBuilder(mockConn);
        URL url = builder.appendKeyVal(new java.util.HashMap<>());
        assertEquals("https://example.com/path?key=val", url.toString());
    }

}