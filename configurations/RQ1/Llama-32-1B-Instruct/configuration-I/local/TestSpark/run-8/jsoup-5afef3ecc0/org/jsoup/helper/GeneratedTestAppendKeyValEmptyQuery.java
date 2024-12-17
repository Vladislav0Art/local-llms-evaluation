package org.jsoup.helper;

public class GeneratedTestAppendKeyValEmptyQuery {

    private UrlBuilder underTest;

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

}