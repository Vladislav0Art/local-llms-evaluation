package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mockito;

public class GeneratedTest {

    @ParameterizedTest
    @CsvFileSource("src/test/resources/urls.csv")
    public void urlBuilder

    appendKeyVal(String inputUrl, String key, String value) {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build().appendKeyVal(Mockito.any(Connection.KeyVal.class))).thenReturn(inputUrl);
        UrlBuilder instance = new UrlBuilder(inputUrl);
        instance.appendKeyVal(key, value);
    }

    @Test
    public void urlBuilder

    appendKeyValWithoutException() {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn("http://example.com");
        UrlBuilder instance = new UrlBuilder("https://example.com");
        instance.appendKeyVal(null, null);
    }

    @Test
    public void urlBuilder

    appendKeyValWithIncorrectException() {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenThrow(new UnsupportedEncodingException());
        try {
            UrlBuilder instance = new UrlBuilder("https://example.com");
            instance.appendKeyVal(null, null);
            fail("Expected UnsupportedOperationException: IllegalArgumentException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @ParameterizedTest
    @CsvFileSource("src/test/resources/urls.csv")
    public void urlBuilder

    build(String inputUrl) {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn(inputUrl);
        UrlBuilder instance = new UrlBuilder(inputUrl);
        String actual = instance.build().toString();
        Mockito.verify(mockUrlBuilder).appendKeyVal(Mockito.any(Connection.KeyVal.class));
    }

    @Test
    public void urlBuilder

    buildWithoutException() {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn("http://example.com");
        UrlBuilder instance = new UrlBuilder("https://example.com");
        String actual = instance.build().toString();
        Mockito.verify(mockUrlBuilder).appendKeyVal(Mockito.any(Connection.KeyVal.class));
    }

    @Test
    public void urlBuilder

    appendKeyValNull() {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn("http://example.com");
        UrlBuilder instance = new UrlBuilder("https://example.com");
        try {
            instance.appendKeyVal(null, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void urlBuilder

    appendKeyValEmptyString() {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn("http://example.com");
        UrlBuilder instance = new UrlBuilder("https://example.com");
        try {
            instance.appendKeyVal("", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void urlBuilder

    appendKeyValNullValue() {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn("http://example.com");
        UrlBuilder instance = new UrlBuilder("https://example.com");
        try {
            instance.appendKeyVal(null, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @ParameterizedTest
    @CsvFileSource("src/test/resources/urls.csv")
    public void urlBuilder

    appendKeyValWithValue(String inputUrl, String key, String value) {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn(inputUrl);
        UrlBuilder instance = new UrlBuilder(inputUrl);
        try {
            instance.appendKeyVal(key, value);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void urlBuilder

    appendKeyValWithEmptyValue() {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn("http://example.com");
        UrlBuilder instance = new UrlBuilder("https://example.com");
        try {
            instance.appendKeyVal("", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @ParameterizedTest
    @CsvFileSource("src/test/resources/urls.csv")
    public void urlBuilder

    appendKeyValWithException(String inputUrl, String key, String value) throws UnsupportedEncodingException {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn(inputUrl);
        UrlBuilder instance = new UrlBuilder(inputUrl);
        try {
            instance.appendKeyVal(key, value);
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void urlBuilder

    appendKeyValWithExceptionAndValue() throws UnsupportedEncodingException {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn("http://example.com");
        UrlBuilder instance = new UrlBuilder("https://example.com");
        try {
            instance.appendKeyVal(null, null);
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @ParameterizedTest
    @CsvFileSource("src/test/resources/urls.csv")
    public void urlBuilder

    appendKeyValWithExceptionAndValueNull(String inputUrl, String key, String value) throws UnsupportedEncodingException {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn(inputUrl);
        UrlBuilder instance = new UrlBuilder(inputUrl);
        try {
            instance.appendKeyVal(key, null);
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @ParameterizedTest
    @CsvFileSource("src/test/resources/urls.csv")
    public void urlBuilder

    appendKeyValWithExceptionAndValueEmpty(String inputUrl, String key, String value) throws UnsupportedEncodingException {
        MockUrlBuilder mockUrlBuilder = new MockUrlBuilder();
        Mockito.when(mockUrlBuilder.build()).thenReturn(inputUrl);
        UrlBuilder instance = new UrlBuilder(inputUrl);
        try {
            instance.appendKeyVal(key, null);
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}