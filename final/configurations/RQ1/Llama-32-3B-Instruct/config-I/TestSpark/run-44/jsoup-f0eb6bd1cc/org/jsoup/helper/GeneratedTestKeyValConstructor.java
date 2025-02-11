package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;

public class GeneratedTestKeyValConstructor {

    @Test
    public void testKeyValConstructor() {
        // No arguments provided, default constructor should be used.
        KeyVal kv = new KeyVal();
        System.out.println(kv.key);
        System.out.println(kv.value);

        // With arguments provided, custom constructor should be used.
        key = "key";
        value = "value";
        KeyVal kv1 = new KeyVal(key, value);
        System.out.println(kv1.key);
        System.out.println(kv1.value);
    }

    public static void main(String[] args) {
        // Public method to access private variable
        public String getKey () {
            return key;
        }

        // Public method to access private variable
        public String getValue () {
            return value;
        }
    }

}