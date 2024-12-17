package org.jsoup.helper;

public class GeneratedTestAppendQueryAndRef {

    private UrlBuilder underTest;

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