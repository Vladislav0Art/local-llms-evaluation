package org.jsoup.helper;

public class GeneratedTestAppendKeyValQuery {

    private UrlBuilder underTest;

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

}