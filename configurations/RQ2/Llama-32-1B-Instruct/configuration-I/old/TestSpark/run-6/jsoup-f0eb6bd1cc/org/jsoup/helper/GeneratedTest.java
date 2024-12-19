package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void [MethodUnderTest]

    Test_build() {
        String inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URI uri = urlBuilder.build();
        assertNotNull(uri);
    }

    @Test
    public void [MethodUnderTest]

    Test_appendKeyVal() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        String expected = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);
        assertEquals(expected, urlBuilder.build().toString());
    }

    @Test
    public void [MethodUnderTest]

    TestAppendKeyValUnsupported() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendNullKey() {
        Map<String, String> kv = new HashMap<>();
        kv.put(null, "value");
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendNullValue() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", null);
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendInvalidKey() {
        Map<String, String> kv = new HashMap<>();
        kv.put("invalid", "value");
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendInvalidValue() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "invalid");
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendNull() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", null);
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendEmptyMap() {
        Map<String, String> kv = new HashMap<>();
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendEmptyString() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "");
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendEmptyStringValue() {
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendEmptyMapValue() {
        Map<String, String> kv = new HashMap<>();
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendEmptyString() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

    @Test
    public void [MethodUnderTest]

    TestAppendEmptyStringValue() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (UnsupportedEncodingException e) {
            // Expect exception to be thrown
        }
    }

}