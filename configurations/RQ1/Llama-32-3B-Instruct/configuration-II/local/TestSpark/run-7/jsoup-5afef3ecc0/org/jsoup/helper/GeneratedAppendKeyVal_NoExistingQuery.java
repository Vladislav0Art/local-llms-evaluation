package org.jsoup.helper;

public class GeneratedAppendKeyVal_NoExistingQuery {

    @Test
    public void appendKeyVal_NoExistingQuery() {
        // Given
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // When
        urlBuilder.appendKeyVal(kv);

        // Then
        assertTrue(urlBuilder.q != null && urlBuilder.q.toString().contains(kv.key()));
    }

}