package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyVal_withInvalidUrl_shouldThrowMalformedURLException {

    private static final String DEFAULT_URL = "https://example.com";

    @Test
    public void appendKeyVal_withInvalidUrl_shouldThrowMalformedURLException() throws UnsupportedEncodingException {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL("invalid://url"));

        org.junit.Assert.assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(null));
    }

}