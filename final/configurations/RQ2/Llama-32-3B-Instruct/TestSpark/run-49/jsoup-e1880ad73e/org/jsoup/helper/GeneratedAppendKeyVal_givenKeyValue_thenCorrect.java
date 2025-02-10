package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.Arrays;

public class GeneratedAppendKeyVal_givenKeyValue_thenCorrect {

    @Test
    public void appendKeyVal_givenKeyValue_thenCorrect() throws UnsupportedEncodingException {
        // Arrange
        String keyValueStr = "key1=value1";
        Connection.KeyVal kv = new Connection.KeyVal("key1", keyValueStr);
        URL inputUrl = new URL("http://example.com/path");
        // Act & Assert
        assertSame(keyValueStr, new UrlBuilder(inputUrl).appendKeyVal(kv));
    }

}