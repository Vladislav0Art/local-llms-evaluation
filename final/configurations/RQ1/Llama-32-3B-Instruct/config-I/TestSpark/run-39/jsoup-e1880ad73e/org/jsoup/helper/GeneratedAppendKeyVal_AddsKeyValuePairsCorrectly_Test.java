package org.jsoup.helper;

public class GeneratedAppendKeyVal_AddsKeyValuePairsCorrectly_Test {

    @Test
    public void appendKeyVal_AddsKeyValuePairsCorrectly_Test() {
        // Arrange
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));

        // Act
        builder.appendKeyVal(Connection.KeyVal.newKeyVal("key1", "value1"));
        builder.appendKeyVal(Connection.KeyVal.newKeyVal("key2", "value2"));
        assertEquals("key1=value1&key2=value2&", builder.q.toString());
    }

}