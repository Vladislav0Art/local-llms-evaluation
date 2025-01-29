package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyValThrowsMalformedURLExceptionIfUrlIsInvalid {

    @Test
    public void testAppendKeyValThrowsMalformedURLExceptionIfUrlIsInvalid() throws MalformedURLException {
        URLBuilder builder = new UrlBuilder("https://invalid.example.com");
        try {
            builder.appendKeyVal("key", "value");
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            // Expected
        }
    }

}