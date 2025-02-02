package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        // Test the equals method
        Attributes attributes1 = new Attributes();
        attributes1.set("value1", "value1");
        attributes1.normalize();

        Attributes attributes2 = new Attributes();
        attributes2.set("value2", "value2");
        attributes2.normalize();

        System.out.println(attributes1.equals(attributes2));
    }

}