package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedAppendKeyValMethodAppendsKeyValueToUrlTest {

    @Test
    public void appendKeyValMethodAppendsKeyValueToUrlTest() throws MalformedURLException, URISyntaxException {
        // Arrange
        URL url = new URL("http://example.com");
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        String value = "hello";

        // Act
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);

        // Assert
        assertEquals("http://example.com?key=value", url.toString());
    }

}