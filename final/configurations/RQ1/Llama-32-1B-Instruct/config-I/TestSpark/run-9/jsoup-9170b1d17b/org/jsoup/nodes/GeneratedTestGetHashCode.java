package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetHashCode {

    @Test
    public void testGetHashCode() {
        // Test the hashCode method
        Attributes attributes = new Attributes();
        attributes.set("value1", "value1");

        int hashcode1 = attributes.hashCode();
        int hashcode2 = attributes.hashCode();

        System.out.println(hashcode1 == hashcode2);
    }

}