package org.jsoup.helper;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyVal_NoParameters_ThrowsUnsupportedEncodingException {

    @Test
    public void appendKeyVal_NoParameters_ThrowsUnsupportedEncodingException() throws UnsupportedEncodingException {
        // Create a new UrlBuilder instance
        UrlBuilder builder = new UrlBuilder(null);

        try {
            // Try to append key-value pair with no parameters
            builder.appendKeyVal((String) null, (String) null); // Java 8
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}