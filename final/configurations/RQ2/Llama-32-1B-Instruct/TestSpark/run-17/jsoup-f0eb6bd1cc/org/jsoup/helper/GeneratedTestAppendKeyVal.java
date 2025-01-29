package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        // Assert
        assertEquals(2, urlBuilder.getKeys().size());
        assertTrue(urlBuilder.getKeys().containsKey("key1"));
        assertTrue(urlBuilder.getKeys().containsKey("key2"));
    }

}