package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedAppendKeyValMethodAppendsMultipleKeyValueToUrlTest {

    @Test
    public void appendKeyValMethodAppendsMultipleKeyValueToUrlTest() throws MalformedURLException, URISyntaxException {
        // Arrange
        URL url = new URL("http://example.com");
        Connection.KeyVal[] kv = {Mockito.mock(Connection.KeyVal.class), Mockito.mock(Connection.KeyVal.class)};
        String value1 = "hello";
        String value2 = "world";

        // Act
        UrlBuilder builder = new UrlBuilder(url);
        for (Connection.KeyVal keyVal : kv) {
            builder.appendKeyVal(keyVal);
        }

        // Assert
        assertEquals("http://example.com?key1=value1&key2=value2", url.toString());
    }

}