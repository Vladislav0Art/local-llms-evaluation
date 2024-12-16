package org.jsoup.helper;

import org.jsoup.helper.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValExceptionTest {

    @Test
    public void appendKeyValExceptionTest() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        // Act
        urlBuilder.appendKeyVal(kv);
    }

}