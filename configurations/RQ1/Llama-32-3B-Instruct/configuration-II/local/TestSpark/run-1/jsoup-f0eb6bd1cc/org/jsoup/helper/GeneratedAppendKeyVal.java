package org.jsoup.helper;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() {
        // Given
        Connection connection = new Connection();
        KeyVal keyVal = new KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(connection);

        // When
        urlBuilder.appendKeyVal(keyVal);

        // Then
        assertNotNull(urlBuilder.q);
        assertEquals("key=value", urlBuilder.q.toString());
    }

}