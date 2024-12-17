package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

@RunWith(org.junit.runner.JUnit4ClassRunner.class)
public class GeneratedAppendMultipleKeyValsMethodTest {

    @org.junit.BeforeClass
    public static void setup() {
        // No setup needed, tests are atomic and don't require a before method.
    }

    @org.junit.AfterClass
    public static void tearDown() {
        // No teardown needed, tests are atomic and don't require an after method.
    }

    @Test
    public void appendMultipleKeyValsMethodTest() throws UnsupportedEncodingException {
        final String expected = "https://example.com?kv1=hello&kv2=world"; // Replace with actual implementation
        java.util.Map<String, String> keyValue1 = java.util.Map.of("key1", "value1");
        java.util.Map<String, String> keyValue2 = java.util.Map.of("key2", "value2");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(new org.jsoup.helper.Connection.KeyVal(keyValue1));
        urlBuilder.appendKeyVal(new org.jsoup.helper.Connection.KeyVal(keyValue2));
        URL result = urlBuilder.build();
        assert result.toString().equals(expected);
    }

}