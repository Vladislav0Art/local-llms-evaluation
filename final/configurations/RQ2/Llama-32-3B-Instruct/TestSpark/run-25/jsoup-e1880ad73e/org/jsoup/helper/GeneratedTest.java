package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    public void testConnectionKeyVal() {
        String key = "key";
        String value = "val";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        assertEquals(key, kv.getKey());
        assertEquals(value, kv.getValue());
    }

}