package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyVal_withValidKeyVal_shouldAppendToUrlCorrectly {

    private static final String DEFAULT_URL = "https://example.com";

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

}