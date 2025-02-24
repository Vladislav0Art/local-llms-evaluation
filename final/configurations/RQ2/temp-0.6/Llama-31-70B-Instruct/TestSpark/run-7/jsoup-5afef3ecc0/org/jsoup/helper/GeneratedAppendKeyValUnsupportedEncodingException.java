package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValUnsupportedEncodingException {

    @Test
    public void appendKeyValUnsupportedEncodingException() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        urlBuilder.appendKeyVal(null);
    }

}