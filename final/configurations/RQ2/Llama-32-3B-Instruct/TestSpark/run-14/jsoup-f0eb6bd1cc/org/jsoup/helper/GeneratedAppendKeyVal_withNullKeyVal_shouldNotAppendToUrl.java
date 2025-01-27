package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyVal_withNullKeyVal_shouldNotAppendToUrl {

    @Test
    public void appendKeyVal_withNullKeyVal_shouldNotAppendToUrl() throws UnsupportedEncodingException {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal kv = null;

        // Act and Assert
        urlBuilder.appendKeyVal(kv);
        String actual = urlBuilder.build().toString();
        org.junit.Assert.assertEquals("https://example.com", actual);
    }

}