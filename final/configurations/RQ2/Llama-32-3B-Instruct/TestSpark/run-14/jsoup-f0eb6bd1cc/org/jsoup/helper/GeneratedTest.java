package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedTest {

    private static final String DEFAULT_URL = "https://example.com";

    @Test
    public void ofUrl_withValidUrl_shouldReturnSameUrl() {
        // Arrange and Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL(DEFAULT_URL));
        String actual = urlBuilder.build().toString();

        // Assert
        org.junit.Assert.assertEquals(DEFAULT_URL, actual);
    }

    @Test
    public void ofUrl_withInvalidUrl_shouldThrowMalformedURLException() {
        // Arrange and Act and Assert
        org.junit.Assert.assertThrows(MalformedURLException.class, () -> new UrlBuilder(new URL("invalid://url")));
    }

    @Test
    public void appendKeyVal_withValidKeyVal_shouldAppendToUrlCorrectly() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        when(kv.getKey()).thenReturn(DEFAULT_URL);
        when(kv.getValue()).thenReturn("key=value");

        UrlBuilder urlBuilder = new UrlBuilder(new URL(DEFAULT_URL));
        org.junit.Assert.assertTrue(urlBuilder.appendKeyVal(kv));

        String actual = urlBuilder.build().toString();
        org.junit.Assert.assertEquals(DEFAULT_URL + "?key=value", actual);
    }

    @Test
    public void appendKeyVal_withNullKey_shouldAppendToUrlCorrectly() throws UnsupportedEncodingException {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL(DEFAULT_URL));

        org.junit.Assert.assertTrue(urlBuilder.appendKeyVal(null));

        String actual = urlBuilder.build().toString();
        org.junit.Assert.assertEquals(DEFAULT_URL, actual);
    }

    @Test
    public void appendKeyVal_withNullValue_shouldAppendToUrlCorrectly() throws UnsupportedEncodingException {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL(DEFAULT_URL));

        org.junit.Assert.assertTrue(urlBuilder.appendKeyVal(null));

        String actual = urlBuilder.build().toString();
        org.junit.Assert.assertEquals(DEFAULT_URL, actual);
    }

    @Test
    public void appendKeyVal_withInvalidUrl_shouldThrowMalformedURLException() throws UnsupportedEncodingException {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL("invalid://url"));

        org.junit.Assert.assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(null));
    }

}