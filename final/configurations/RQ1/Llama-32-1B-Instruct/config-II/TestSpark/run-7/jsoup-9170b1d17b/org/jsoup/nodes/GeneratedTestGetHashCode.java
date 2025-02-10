package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetHashCode {

    @Test
    public void testGetHashCode() {
        Attributes attributes = new Attributes();
        attributes.set("a", "1");
        attributes.set("b", 2);

        int hashCode1 = Main.class.hashCode(); // for classes
        int hashCode2 = attributes.hashCode();

        System.out.println(hashCode1 == hashCode2); // prints false

        int duplicateHashCode = Main.deduplicate(ParseSettings PRESERVE_ATTRIBUTE_CASE).hashCode();
        System.out.println(hashCode1 == duplicateHashCode); // prints true
    }

}