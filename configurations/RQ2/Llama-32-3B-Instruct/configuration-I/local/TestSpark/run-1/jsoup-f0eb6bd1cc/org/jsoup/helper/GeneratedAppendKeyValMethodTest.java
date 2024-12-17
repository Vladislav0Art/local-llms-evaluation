package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

@RunWith(org.junit.runner.JUnit4ClassRunner.class)
public class GeneratedAppendKeyValMethodTest {

    @org.junit.BeforeClass
    public static void setup() {
        // No setup needed, tests are atomic and don't require a before method.
    }

    @org.junit.AfterClass
    public static void tearDown() {
        // No teardown needed, tests are atomic and don't require an after method.
    }

    @Test
    public void appendKeyValMethodTest() throws UnsupportedEncodingException {
        final String expected = "https://example.com?kv=hello"; // Replace with actual implementation
        java.util.Map<String, String> keyValue = java.util.Map.of("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(new org.jsoup.helper.Connection.KeyVal(keyValue));
        URL result = urlBuilder.build();
        assert result.toString().equals(expected);
    }

}