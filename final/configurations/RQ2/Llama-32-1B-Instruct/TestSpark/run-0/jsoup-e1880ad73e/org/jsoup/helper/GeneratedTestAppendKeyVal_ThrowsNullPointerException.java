package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_ThrowsNullPointerException {

    @Test
    public void testAppendKeyVal_ThrowsNullPointerException() {
        String inputUrl = "https://example.com/path";
        try {
            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(new StringBuilder()); // throws NullPointerException
        } catch (NullPointerException e) {
            assertEquals("NullPointerException", e.getMessage());
        }
    }

}