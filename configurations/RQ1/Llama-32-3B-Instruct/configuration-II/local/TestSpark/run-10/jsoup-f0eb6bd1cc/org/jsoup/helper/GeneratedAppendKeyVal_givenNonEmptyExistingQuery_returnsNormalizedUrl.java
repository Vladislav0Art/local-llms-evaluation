package org.jsoup.helper;

public class GeneratedAppendKeyVal_givenNonEmptyExistingQuery_returnsNormalizedUrl {

    @Test
    public void appendKeyVal_givenNonEmptyExistingQuery_returnsNormalizedUrl() {
        // Given
        Connection.KeyVal connectionKeyVal = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path?query=value&new=query"));

        // When
        urlBuilder.appendKeyVal(connectionKeyVal);

        // Then
        assertEquals("http://example.com/path?value=new.query", urlBuilder.u.toString());
    }

}