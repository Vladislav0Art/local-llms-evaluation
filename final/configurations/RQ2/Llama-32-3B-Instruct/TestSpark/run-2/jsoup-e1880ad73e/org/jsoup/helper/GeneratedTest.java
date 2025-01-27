package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testConnectionKeyVal() {
        String key = "key";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);

        assertEquals(key, kv.getKey());
        assertEquals(value, kv.getValue());
    }

    @Test
    public void testConnectionKeyValBuilder() {
        String key = "key";
        String value = "value";
        builder.appendKeyVal(Connection.KeyVal.of(key, value));

        assertEquals(key, builder.getKey());
        assertEquals(value, builder.getValue());
    }

    @Test
    public void testConnectionKeyValWithSpecialChar() {
        String key = "key%20def";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);

        assertEquals("key%20def", kv.getKey());
        assertEquals(value, kv.getValue());
    }

    @Test
    public void testConnectionKeyValWithSpecialCharBuilder() {
        String key = "key%20def";
        String value = "value";
        builder.appendKeyVal(Connection.KeyVal.of(key, value));

        assertEquals("key%20def", builder.getKey());
        assertEquals(value, builder.getValue());
    }

    @Test
    public void testConnectionKeyValWithNullValue() {
        String key = "key";
        Connection.KeyVal kv = new Connection.KeyVal(key, null);

        assertEquals(key, kv.getKey());
        assertNull(kv.getValue());
    }

    @Test
    public void testConnectionKeyValBuilderWithNullValue() {
        String key = "key";
        builder.appendKeyVal(Connection.KeyVal.of(key, null));

        assertEquals(key, builder.getKey());
        assertNull(builder.getValue());
    }
}

public class Connection {
    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    public static class Builder {
        private String key;
        private String value;

        public Builder appendKeyVal(Connection.KeyVal kv) {
            this.key = kv.getKey();
            this.value = kv.getValue();
            return this;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

}