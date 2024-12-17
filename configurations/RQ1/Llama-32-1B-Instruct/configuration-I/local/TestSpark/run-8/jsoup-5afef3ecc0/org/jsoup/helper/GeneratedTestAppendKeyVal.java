package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

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

}