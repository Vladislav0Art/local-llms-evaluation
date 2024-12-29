package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_MalformedKV {

    @Test
    public void testAppendKeyVal_MalformedKV() {
        String inputUrl = "https://example.com/path?a=b";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        try {
            builder.appendKeyVal(new MalformedURLException()); // throws MalformedURLException
        } catch (MalformedURLException e) {
            assertEquals("MalformedURLException", e.getMessage());
        }
    }

}