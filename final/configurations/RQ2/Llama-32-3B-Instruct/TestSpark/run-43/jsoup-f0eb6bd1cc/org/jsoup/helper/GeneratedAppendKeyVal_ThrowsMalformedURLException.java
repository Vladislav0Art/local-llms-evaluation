package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyVal_ThrowsMalformedURLException {

    @Test
    public void appendKeyVal_ThrowsMalformedURLException() {
        // Arrange
        URL inputUrl = new URL("http://example.com/path");

        // Act and Assert
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(inputUrl).appendKeyVal(Connection.KeyVal.KEY_VALUE_MAPPER.convert(new HashMap<>())));
    }

}