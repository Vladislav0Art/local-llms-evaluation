package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConnectionKeyValWithSpecialChar {

    @Test
    public void testConnectionKeyValWithSpecialChar() {
        String key = "key%20def";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);

        assertEquals("key%20def", kv.getKey());
        assertEquals(value, kv.getValue());
    }

}