package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_EmptyKV {

    @Test
    public void testAppendKeyVal_EmptyKV() {
        String inputUrl = "https://example.com/path";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.appendKeyVal(new StringBuilder()); // throws NullPointerException
        } catch (NullPointerException e) {
            assertEquals("NullPointerException", e.getMessage());
        }
    }

}