package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.Arrays;

public class GeneratedAppendKeyVal_givenEmptyKeyValue_thenCorrect {

    @Test
    public void appendKeyVal_givenEmptyKeyValue_thenCorrect() throws UnsupportedEncodingException {
        // Arrange
        String keyValueStr = "";
        Connection.KeyVal kv = new Connection.KeyVal("key1", keyValueStr);
        URL inputUrl = new URL("http://example.com/path");
        // Act & Assert
        assertEquals("", new UrlBuilder(inputUrl).appendKeyVal(kv));
    }

}