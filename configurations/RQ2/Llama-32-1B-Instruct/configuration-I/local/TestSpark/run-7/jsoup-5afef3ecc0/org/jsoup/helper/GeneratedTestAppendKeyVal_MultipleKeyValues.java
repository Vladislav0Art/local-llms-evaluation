package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_MultipleKeyValues {

    @Test
    public void testAppendKeyVal_MultipleKeyValues() {
        // Arrange
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");

        // Act
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        // Assert
        assertEquals("key1=value1&key2=value2", urlBuilder.build().toString());
    }

}