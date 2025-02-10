package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedAppendKeyValMethodThrowsUnsupportedEncodingExceptionTest {

    @Test
    public void appendKeyValMethodThrowsUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException, URISyntaxException {
        // Arrange
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(null).appendKeyVal(kv));
    }

}