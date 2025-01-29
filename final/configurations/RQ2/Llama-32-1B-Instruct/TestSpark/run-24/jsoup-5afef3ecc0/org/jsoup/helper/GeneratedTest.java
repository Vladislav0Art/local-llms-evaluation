package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.URI;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    private String urlString = "https://example.com/path";

    @BeforeEach
    public void setup() {
        URLBuilder urlBuilder = new UrlBuilder(new URI(urlString));
    }

    @Test
    public void testBuildUrlsWithExistingQueryParams() throws UnsupportedEncodingException {
        Connection connection = Connection.create(urlString);
        String expectedQueryString = "foo=bar&baz=qux";
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryString, actualQueryString);
    }

    @Test
    public void testBuildUrlsWithNoExistingQueryParams() throws UnsupportedEncodingException {
        Connection connection = Connection.create(urlString);
        String expectedUrl = urlBuilder.build().toString();
        String actualUrl = urlBuilder.build().toExternalForm();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String expectedQueryParams = "foo=bar&baz=qux";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(connection.getKeyVal("foo", "bar"));
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithEmptyMap() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(connection.getKeyVal());
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithNullMap() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(null);
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithEmptyMap_WithNull() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(null);
        urlBuilder.appendKeyVal(connection.getKeyVal());
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithNullKey() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(null, "bar");
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithNullValue() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(null, null);
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithEmptyMapValue() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(connection.getKeyVal());
        urlBuilder.appendKeyVal(null);
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithNullValue_WithEmptyMap() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(null);
        urlBuilder.appendKeyVal(connection.getKeyVal());
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithNullValue_WithEmptyMap_WithNull() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(null);
        urlBuilder.appendKeyVal(connection.getKeyVal());
        urlBuilder.appendKeyVal(null);
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithEmptyMapValue_WithNull() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(connection.getKeyVal());
        urlBuilder.appendKeyVal(null);
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithNullValue_WithEmptyMapValue() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(connection.getKeyVal());
        urlBuilder.appendKeyVal(null);
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithEmptyMapValue_WithNullValue() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(connection.getKeyVal());
        urlBuilder.appendKeyVal(null);
        urlBuilder.appendKeyVal(null);
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

    @Test
    public void testAppendKeyVal_WithEmptyMapValue_WithNullValue_WithEmptyMap() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(connection.getKeyVal());
        urlBuilder.appendKeyVal(null);
        urlBuilder.appendKeyVal(null);
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

}