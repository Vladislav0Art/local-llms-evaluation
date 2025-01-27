package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConnectionKeyValWithSpecialCharBuilder {

    @Test
    public void testConnectionKeyValWithSpecialCharBuilder() {
        String key = "key%20def";
        String value = "value";
        builder.appendKeyVal(Connection.KeyVal.of(key, value));

        assertEquals("key%20def", builder.getKey());
        assertEquals(value, builder.getValue());
    }

}