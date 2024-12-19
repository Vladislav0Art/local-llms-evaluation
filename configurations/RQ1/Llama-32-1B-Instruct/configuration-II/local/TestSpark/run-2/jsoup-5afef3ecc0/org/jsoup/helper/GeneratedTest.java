package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class GeneratedTest {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @BeforeEach
    public void setUp() {
        String inputUrl1 = "https://example.com/path?query=value#fragment";
        String inputUrl2 = "https://example.com/path%20with%20spaces";

        URL u1 = urlBuilder.build();
        URL u2 = urlBuilder.build();

        assert u1 != null;
        assert !u1.getQuery().isEmpty();
        assertEquals(u1, u2);
    }

    @Test
    public void testAppendKeyVal() {
        String key = "key";
        String value = "value";

        urlBuilder.appendKeyVal(keyValueToKey(value));
        assertEquals("key=value", keyEncoder(key) + "=" + valueEncoder(value));
    }

    private String keyEncoder(String key) {
        return URLDecoder.decode(key, StandardCharsets.UTF_8.name());
    }

    private String valueEncoder(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8.name());
    }

    @Test
    public void testAppendKeyValNoEncode() {
        String key = "key";
        urlBuilder.appendKeyVal(keyValueToKey(key));
        assertEquals("key", key);
    }

    @Test
    public void testAppendKeyValMultipleValues() throws UnsupportedEncodingException {
        String[] values = {"value1", "value2"};
        for (String value : values) {
            urlBuilder.appendKeyVal(valueValueToKey(value));
        }
        assertEquals(2, values.length);
    }

    private String keyEncoder(String key) {
        return StringUtil.borrowBuilder().append(key).append('?');
    }

    @Test
    public void testNormalizeQuery() throws UnsupportedEncodingException {
        String query = "query=value";
        URL u = urlBuilder.build();
        assertEquals(query, u.getQuery());
    }

    @Test
    public void testNormalizeRef() throws UnsupportedEncodingException {
        String ref = "ref=withspaces";
        URL u = urlBuilder.build();
        assertEquals(ref, u.getRef());
    }

    private String decodePart(String encoded) {
        try {
            return URLDecoder.decode(encoded, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e); // wtf!
        }
    }

    @Test
    public void testDecodePart() throws UnsupportedEncodingException {
        String encoded = "IDN.toASCII(decodePart(u.getHost()))";
        String expected = IDN.toASCII("example.com");
        assertEquals(expected, decodePart(encoded));
    }

    private String encodePath(String path) {
        URI uri = new URI(
                u.getProtocol(),
                u.getUserInfo(),
                IDN.toASCII(path), // puny-code
                u.getPort(),
                decodePath(uri.getPath()),
                null, null // query and fragment appended later so as not to encode
        );
        return uri.toASCIIString();
    }

    @Test
    public void testEncodePath() throws URISyntaxException {
        String path = "path%20with%20spaces";
        URI uri = new URI(
                u.getProtocol(),
                u.getUserInfo(),
                IDN.toASCII(path), // puny-code
                u.getPort(),
                encodePath(uri.getPath()),
                null, null // query and fragment appended later so as not to encode
        );
        assertEquals("path%20with%20spaces", uri.toString());
    }

    @Test
    public void testNormalizePath() throws URISyntaxException {
        String path = "path%20with%20spaces";
        URI uri = new URI(
                u.getProtocol(),
                u.getUserInfo(),
                IDN.toASCII(path), // puny-code
                u.getPort(),
                encodePath(uri.getPath()),
                null, null // query and fragment appended later so as not to encode
        );
        assertEquals("path%20with%20spaces", uri.toString());
    }

    private String decodePart(String encoded) {
        try {
            return URLDecoder.decode(encoded, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e); // wtf!
        }
    }

    @Test
    public void testNormalizeRef() throws UnsupportedEncodingException {
        String ref = "ref%20withspaces";
        URI uri = new URI(
                u.getProtocol(),
                u.getUserInfo(),
                IDN.toASCII(decodePart(u.getHost())), // puny-code
                u.getPort(),
                decodePath(uri.getPath()),
                null, null // query and fragment appended later so as not to encode
        );
        assertEquals(ref, uri.toASCIIString());
    }

    @Test
    public void testNormalizeRefNoSpace() throws UnsupportedEncodingException {
        String ref = "ref";
        URI uri = new URI(
                u.getProtocol(),
                u.getUserInfo(),
                IDN.toASCII(decodePart(u.getHost())), // puny-code
                u.getPort(),
                decodePath(uri.getPath()),
                null, null // query and fragment appended later so as not to encode
        );
        assertEquals(ref, uri.toASCIIString());
    }

}