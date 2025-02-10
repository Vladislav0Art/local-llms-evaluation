package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyVal_WithNullValue_ThrowsUnsupportedEncodingException {

    @Test
    public void appendKeyVal_WithNullValue_ThrowsUnsupportedEncodingException() {
        // Arrange
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Map<String, String> keyValue = new HashMap<>();
        keyValue.put("key", null);

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(Connection.KeyVal.KEY_VALUE_MAPPER.convert(keyValue)));
    }

}