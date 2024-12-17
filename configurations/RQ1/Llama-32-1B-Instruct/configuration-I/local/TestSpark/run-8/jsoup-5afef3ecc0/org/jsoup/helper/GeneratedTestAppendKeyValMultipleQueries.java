package org.jsoup.helper;

public class GeneratedTestAppendKeyValMultipleQueries {

    private UrlBuilder underTest;

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

}