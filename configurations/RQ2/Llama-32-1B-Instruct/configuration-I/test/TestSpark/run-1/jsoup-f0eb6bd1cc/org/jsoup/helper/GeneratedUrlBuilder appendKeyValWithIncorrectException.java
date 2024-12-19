package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mockito;

public class GeneratedUrlBuilder appendKeyValWithIncorrectException {

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

}