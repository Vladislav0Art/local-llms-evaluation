package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyVal_withInvalidKeyVal_shouldThrowUnsupportedEncodingException {

    @Test
    public void appendKeyVal_withInvalidKeyVal_shouldThrowUnsupportedEncodingException() throws UnsupportedEncodingException {
        // Arrange and Act and Assert
        org.junit.Assert.assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(new URL("https://example.com")).appendKeyVal(null));
    }

}