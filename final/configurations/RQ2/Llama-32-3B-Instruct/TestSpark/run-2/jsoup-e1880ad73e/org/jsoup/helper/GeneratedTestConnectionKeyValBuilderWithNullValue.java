package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConnectionKeyValBuilderWithNullValue {

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