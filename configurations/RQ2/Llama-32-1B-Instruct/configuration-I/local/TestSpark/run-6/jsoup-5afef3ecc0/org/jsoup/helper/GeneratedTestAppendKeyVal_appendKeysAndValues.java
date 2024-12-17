package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestAppendKeyVal_appendKeysAndValues {

    @Test
    public void testAppendKeyVal_appendKeysAndValues() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");

        Mockito.when(inputUrl.getQuery()).thenReturn(null);
        Mockito.when(inputUrl.getFragment()).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        String actual = urlBuilder.appendKeyVal(kv1).appendKeyVal(kv2).toString();

        // Assert
        assertEquals("key1=value1&key2=value2", actual);
    }

}