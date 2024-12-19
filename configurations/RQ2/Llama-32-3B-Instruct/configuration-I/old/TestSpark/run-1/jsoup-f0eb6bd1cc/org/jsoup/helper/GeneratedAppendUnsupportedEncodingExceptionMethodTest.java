package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

@RunWith(org.junit.runner.JUnit4ClassRunner.class)
public class GeneratedAppendUnsupportedEncodingExceptionMethodTest {

    @org.junit.BeforeClass
    public static void setup() {
        // No setup needed, tests are atomic and don't require a before method.
    }

    @org.junit.AfterClass
    public static void tearDown() {
        // No teardown needed, tests are atomic and don't require an after method.
    }

    @Test
    public void appendUnsupportedEncodingExceptionMethodTest() {
        final String expected = "https://example.com?exception=UnsupportedEncodingException"; // Replace with actual implementation
        try {
            UrlBuilder urlBuilder = new UrlBuilder(null);
            urlBuilder.appendKeyVal(new org.jsoup.helper.Connection.KeyVal(java.util.Map.of()));
            assert false;
        } catch (java.io.UnsupportedEncodingException e) {
            assert e.getMessage().equals(expected);
        }
    }

}