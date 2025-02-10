package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestHashCode {

    @Test
    public void testHashCode() {
        Attributes attributes = new Attributes();
        attributes.set("key1", "value1");
        attributes.set("key2", "value2");

        int hashCode1 = attributes.hashCode();
        int hashCode2 = attributes.hashCode();

        Assertions.assertTrue(hashCode1 == hashCode2);
    }

}