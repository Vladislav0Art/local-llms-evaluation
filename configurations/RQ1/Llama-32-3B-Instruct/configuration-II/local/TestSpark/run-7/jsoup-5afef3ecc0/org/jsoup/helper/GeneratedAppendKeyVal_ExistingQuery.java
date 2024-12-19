package org.jsoup.helper;

public class GeneratedAppendKeyVal_ExistingQuery {

    @Test
    public void appendKeyVal_ExistingQuery() {
        // Given
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));

        // When
        urlBuilder.appendKeyVal(kv);

        // Then
        assertTrue(urlBuilder.q != null && urlBuilder.q.toString().contains(kv.key() + "&" + kv.value()));
    }

}