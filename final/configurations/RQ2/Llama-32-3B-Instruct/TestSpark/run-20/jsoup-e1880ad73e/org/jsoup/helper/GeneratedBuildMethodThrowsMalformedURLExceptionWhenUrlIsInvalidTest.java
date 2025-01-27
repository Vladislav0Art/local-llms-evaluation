package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedBuildMethodThrowsMalformedURLExceptionWhenUrlIsInvalidTest {

    @Test
    public void buildMethodThrowsMalformedURLExceptionWhenUrlIsInvalidTest() {
        UrlBuilder builder = new UrlBuilder(new URL("invalid://example.com"));
        try {
            builder.build();
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            assertEquals("Invalid protocol", e.getMessage());
        }
    }

}