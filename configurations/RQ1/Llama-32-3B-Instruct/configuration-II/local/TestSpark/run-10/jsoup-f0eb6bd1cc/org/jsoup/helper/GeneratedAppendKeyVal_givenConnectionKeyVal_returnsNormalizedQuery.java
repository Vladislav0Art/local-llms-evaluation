package org.jsoup.helper;

public class GeneratedAppendKeyVal_givenConnectionKeyVal_returnsNormalizedQuery {

    @Test
    public void appendKeyVal_givenConnectionKeyVal_returnsNormalizedQuery() {
        // Given
        Connection.KeyVal connectionKeyVal = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path?query="));

        // When
        urlBuilder.appendKeyVal(connectionKeyVal);

        // Then
        assertEquals("key=value", urlBuilder.q.toString());
    }

}