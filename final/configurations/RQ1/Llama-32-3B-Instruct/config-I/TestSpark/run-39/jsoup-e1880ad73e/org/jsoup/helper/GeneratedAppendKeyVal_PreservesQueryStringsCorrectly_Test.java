package org.jsoup.helper;

public class GeneratedAppendKeyVal_PreservesQueryStringsCorrectly_Test {

    @Test
    public void appendKeyVal_PreservesQueryStringsCorrectly_Test() {
        // Arrange
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));

        // Act
        builder.appendKeyVal(Connection.KeyVal.newKeyVal("key", "value"));
        assertEquals("key=value&", builder.q.toString());
    }

}