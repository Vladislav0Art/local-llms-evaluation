package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    private final URLBuilder urlBuilder = new UrlBuilder();

    @Test
    public void testBuildUrl_WithNoAppendKeyVal() {
        URLBuilder.Result result = urlBuilder.build();
        assertNotNull(result);
    }

    @Test
    public void testBuildUrl_WithInvalidKeyVal() {
        // Simulate an exception is thrown when appending a key-value pair
        URLBuilder.Result result = null;
        try {
            urlBuilder.appendKeyVal(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
        assertEquals("", result);
    }

    @Test
    public void testBuildUrl_WithValidKeyVal() {
        URLBuilder.Result result = urlBuilder.build();
        assertNotNull(result);
    }

    @Test
    public void testAppendKeyVal_WithSupportedEncoding() throws Exception {
        String key = "key";
        String value = "value";

        // Simulate a successful append of a key-value pair with supported encoding
        HttpURLConnection connection = new HttpURLConnection(new URL("http://example.com"))
                .setDoOutput(true)
                .setFixedPayload(key + "=" + value, StandardCharsets.UTF_8.toString());
        connection.setRequestMethod("PUT");

        assertEquals(200, connection.getResponseCode());

        // Simulate a successful append of another key-value pair
        key = "key2";
        value = "value2";

        // Simulate an exception is thrown when appending another key-value pair
        URLBuilder.Result result = null;
        try {
            urlBuilder.appendKeyVal(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
        assertEquals("", result);

        assertEquals(200, connection.getResponseCode());

        // Verify that the second key-value pair is appended successfully
        HttpURLConnection connection2 = new HttpURLConnection(new URL("http://example.com"))
                .setDoOutput(true)
                .setFixedPayload(key + "=" + value, StandardCharsets.UTF_8.toString());
        connection2.setRequestMethod("PUT");
        assertEquals(200, connection2.getResponseCode());

        // Verify that the first key-value pair is not appended
        HttpURLConnection connection3 = new HttpURLConnection(new URL("http://example.com"))
                .setDoOutput(true)
                .setFixedPayload(key + "=" + value, StandardCharsets.UTF_8.toString());
        connection3.setRequestMethod("PUT");
        assertEquals(500, connection3.getResponseCode());

        // Verify that the second key-value pair is appended successfully
        HttpURLConnection connection4 = new HttpURLConnection(new URL("http://example.com"))
                .setDoOutput(true)
                .setFixedPayload(key + "=" + value, StandardCharsets.UTF_8.toString());
        connection4.setRequestMethod("PUT");
        assertEquals(200, connection4.getResponseCode());

        // Verify that the first key-value pair is not appended
        HttpURLConnection connection5 = new HttpURLConnection(new URL("http://example.com"))
                .setDoOutput(true)
                .setFixedPayload(key + "=" + value, StandardCharsets.UTF_8.toString());
        connection5.setRequestMethod("PUT");
        assertEquals(500, connection5.getResponseCode());

        // Verify that the second key-value pair is appended successfully
        HttpURLConnection connection6 = new HttpURLConnection(new URL("http://example.com"))
                .setDoOutput(true)
                .setFixedPayload(key + "=" + value, StandardCharsets.UTF_8.toString());
        connection6.setRequestMethod("PUT");
        assertEquals(200, connection6.getResponseCode());

        // Verify that the first key-value pair is not appended
        HttpURLConnection connection7 = new HttpURLConnection(new URL("http://example.com"))
                .setDoOutput(true)
                .setFixedPayload(key + "=" + value, StandardCharsets.UTF_8.toString());
        connection7.setRequestMethod("PUT");
        assertEquals(500, connection7.getResponseCode());

        // Verify that the second key-value pair is appended successfully
        HttpURLConnection connection8 = new HttpURLConnection(new URL("http://example.com"))
                .setDoOutput(true)
                .setFixedPayload(key + "=" + value, StandardCharsets.UTF_8.toString());
        connection8.setRequestMethod("PUT");
        assertEquals(200, connection8.getResponseCode());

        // Verify that the first key-value pair is not appended
        HttpURLConnection connection9 = new HttpURLConnection(new URL("http://example.com"))
                .setDoOutput(true)
                .setFixedPayload(key + "=" + value, StandardCharsets.UTF_8.toString());
        connection9.setRequestMethod("PUT");
        assertEquals(500, connection9.getResponseCode());

        // Verify that the second key-value pair is appended successfully
        HttpURLConnection connection10 = new HttpURLConnection(new URL("http://example.com"))
                .setDoOutput(true)
                .setFixedPayload(key + "=" + value, StandardCharsets.UTF_8.toString());
        connection10.setRequestMethod("PUT");
        assertEquals(200, connection10.getResponseCode());
    }

}