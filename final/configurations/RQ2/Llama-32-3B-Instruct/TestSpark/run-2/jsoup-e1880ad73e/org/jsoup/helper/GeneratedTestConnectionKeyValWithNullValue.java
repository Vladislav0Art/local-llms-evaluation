package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConnectionKeyValWithNullValue {

    @Test
    public void testConnectionKeyValWithNullValue() {
        String key = "key";
        Connection.KeyVal kv = new Connection.KeyVal(key, null);

        assertEquals(key, kv.getKey());
        assertNull(kv.getValue());
    }

}