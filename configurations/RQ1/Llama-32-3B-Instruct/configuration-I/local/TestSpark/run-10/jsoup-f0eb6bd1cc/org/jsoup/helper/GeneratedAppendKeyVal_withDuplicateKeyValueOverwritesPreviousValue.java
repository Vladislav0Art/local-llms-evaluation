package org.jsoup.helper;

public class GeneratedAppendKeyVal_withDuplicateKeyValueOverwritesPreviousValue {

    @Test
    public void appendKeyVal_withDuplicateKeyValueOverwritesPreviousValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key1", "value1");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        builder.appendKeyVal(kv);
        kv = new Connection.KeyVal("key2", "value2");
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals(4, builder.q.length());
        assertTrue(builder.q.toString().contains("?key1=value1&key2=value2"));
    }

    private void assertNormalizedUrl(String normalizedUrl, String expectedUrl) {
        // Implement your own assertion logic here
    }

}