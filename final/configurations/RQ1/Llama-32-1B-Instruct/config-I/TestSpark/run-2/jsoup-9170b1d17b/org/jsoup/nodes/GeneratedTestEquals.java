package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();

        attributes1.normalize();
        attributes2.normalize();

        System.out.println(attributes1.equals(attributes2)); // Expected: true

        attributes1.normalize();
        attributes2 = new Attributes();  // Reset attributes
        System.out.println(attributes1.equals(attributes2)); // Expected: false
    }

}