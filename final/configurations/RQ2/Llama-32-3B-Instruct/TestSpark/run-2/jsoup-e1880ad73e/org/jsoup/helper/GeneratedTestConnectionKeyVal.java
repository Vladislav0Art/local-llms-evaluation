package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConnectionKeyVal {

    @Test
    public void testConnectionKeyVal() {
        String key = "key";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);

        assertEquals(key, kv.getKey());
        assertEquals(value, kv.getValue());
    }

}