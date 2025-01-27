package org.jsoup.helper;

public class GeneratedTestConnectionKeyVal {

    @Test
    public void testConnectionKeyVal() {
        String key = "key";
        String value = "val";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        assertEquals(key, kv.getKey());
        assertEquals(value, kv.getValue());
    }

}