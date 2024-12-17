package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder underTest;

    @Test
    public void testAppendKeyVal() {
        // Arrange
        String[] keyVals = {"key1=value1", "key2=value2"};
        Connection.KeyVal kv1 = new Connection.KeyVal("url1", keyVals[0]);
        Connection.KeyVal kv2 = new Connection.KeyVal("url2", keyVals[1]);

        // Act
        underTest.appendKeyVal(kv1);
        underTest.appendKeyVal(kv2);

        // Assert
        assertEquals(3, underTest.q.length());
    }

    @Test
    public void testAppendKeyValEmptyQuery() {
        // Arrange
        String[] keyVals = {"key1=value1"};
        Connection.KeyVal kv1 = new Connection.KeyVal("url1", keyVals[0]);

        // Act
        underTest.appendKeyVal(kv1);

        // Assert
        assertEquals(2, underTest.q.length());
    }

    @Test
    public void testAppendKeyValRef() {
        // Arrange
        String[] keyVals = {"key1=value1"};
        Connection.KeyVal kv1 = new Connection.KeyVal("url1", keyVals[0]);
        String ref = "ref1";
        underTest.appendKeyVal(kv1);
        assertRefEqual(ref, underTest.q.toString());
    }

    @Test
    public void testAppendKeyValMultipleQueries() {
        // Arrange
        String[] keyVals = {"key1=value1", "key2=value2"};
        Connection.KeyVal kv1 = new Connection.KeyVal("url1", keyVals[0]);
        Connection.KeyVal kv2 = new Connection.KeyVal("url2", keyVals[1]);

        // Act
        underTest.appendKeyVal(kv1);
        underTest.appendKeyVal(kv2);

        // Assert
        assertEquals(4, underTest.q.length());
    }

    private void assertRefEqual(String ref, String q) {
        assertEquals(ref, urlEncode(q));
    }

    @Test
    public void testAppendKeyValQuery() throws UnsupportedEncodingException {
        // Arrange
        String[] keyVals = {"key1=value1", "key2=value2"};
        Connection.KeyVal kv1 = new Connection.KeyVal("url1", keyVals[0]);
        Connection.KeyVal kv2 = new Connection.KeyVal("url2", keyVals[1]);

        when(connection.getKeyVal("url1")).thenReturn(kv1);
        when(connection.getKeyVal("url2")).thenReturn(kv2);

        // Act
        underTest.appendKeyVal(kv1);
        underTest.appendKeyVal(kv2);

        // Assert
    }

    @Test
    public void testAppendQuery() throws UnsupportedEncodingException {
        // Arrange
        String[] keyVals = {"key1=value1", "key2=value2"};
        Connection.KeyVal kv1 = new Connection.KeyVal("url1", keyVals[0]);
        Connection.KeyVal kv2 = new Connection.KeyVal("url2", keyVals[1]);

        when(connection.getKeyVal("url1")).thenReturn(kv1);
        when(connection.getKeyVal("url2")).thenReturn(kv2);

        // Act
        underTest.appendKeyVal(kv1);
        underTest.appendKeyVal(kv2);

        // Assert
    }

    @Test
    public void testAppendRef() {
        // Arrange
        String[] keyVals = {"key1=value1", "key2=value2"};
        Connection.KeyVal kv1 = new Connection.KeyVal("url1", keyVals[0]);
        String ref = "ref1";
        underTest.appendKeyVal(kv1);
        urlEncode(normalizedUri.toString());
    }

    @Test
    public void testAppendQueryAndRef() throws UnsupportedEncodingException {
        // Arrange
        String[] keyVals = {"key1=value1", "key2=value2"};
        Connection.KeyVal kv1 = new Connection.KeyVal("url1", keyVals[0]);
        Connection.KeyVal kv2 = new Connection.KeyVal("url2", keyVals[1]);

        when(connection.getKeyVal("url1")).thenReturn(kv1);
        when(connection.getKeyVal("url2")).thenReturn(kv2);

        // Act
        underTest.appendKeyVal(kv1);
        assertRefEqual(normalizedUri.toString(), underTest.q.toString());
    }

    private void urlEncode(String str) {
        try {
            return URLEncoder.encode(str, UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e); // wtf!
        }
    }

}