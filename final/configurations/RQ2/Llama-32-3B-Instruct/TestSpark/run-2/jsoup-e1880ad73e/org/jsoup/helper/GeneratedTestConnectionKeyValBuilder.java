package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConnectionKeyValBuilder {

    @Test
    public void testConnectionKeyValBuilder() {
        String key = "key";
        String value = "value";
        builder.appendKeyVal(Connection.KeyVal.of(key, value));

        assertEquals(key, builder.getKey());
        assertEquals(value, builder.getValue());
    }

}