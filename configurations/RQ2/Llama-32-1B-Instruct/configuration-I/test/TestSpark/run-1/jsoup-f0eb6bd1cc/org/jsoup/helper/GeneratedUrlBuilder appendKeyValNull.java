package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mockito;

public class GeneratedUrlBuilder appendKeyValNull {

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

}