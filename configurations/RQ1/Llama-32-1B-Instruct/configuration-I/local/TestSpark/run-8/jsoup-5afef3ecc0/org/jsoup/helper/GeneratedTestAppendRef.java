package org.jsoup.helper;

public class GeneratedTestAppendRef {

    private UrlBuilder underTest;

    @Test
    public void testAppendRef() {
        // Arrange
        String[] keyVals = {"key1=value1", "key2=value2"};
        Connection.KeyVal kv1 = new Connection.KeyVal("url1", keyVals[0]);
        String ref = "ref1";
        underTest.appendKeyVal(kv1);
        urlEncode(normalizedUri.toString());
    }

}