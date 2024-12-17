package org.jsoup.helper;

public class GeneratedTestAppendKeyValRef {

    private UrlBuilder underTest;

    @Test
    public void testAppendKeyValRef() {
        // Arrange
        String[] keyVals = {"key1=value1"};
        Connection.KeyVal kv1 = new Connection.KeyVal("url1", keyVals[0]);
        String ref = "ref1";
        underTest.appendKeyVal(kv1);
        assertRefEqual(ref, underTest.q.toString());
    }

}