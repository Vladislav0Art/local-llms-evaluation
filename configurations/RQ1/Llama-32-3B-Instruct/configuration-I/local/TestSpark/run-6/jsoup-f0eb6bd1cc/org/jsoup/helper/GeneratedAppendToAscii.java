package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;

public class GeneratedAppendToAscii {

    @Test
    public void appendToAscii() throws UnsupportedEncodingException {
        // Arrange
        StringBuilder sb = new StringBuilder();

        // Act
        UrlBuilder.appendToAscii("ä", false, sb);

        // Assert
        assertEquals("%C3%A4", sb.toString());
    }

}