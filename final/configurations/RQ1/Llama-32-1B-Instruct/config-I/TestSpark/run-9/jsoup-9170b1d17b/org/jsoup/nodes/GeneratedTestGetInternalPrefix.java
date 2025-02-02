package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetInternalPrefix {

    @Test
    public void testGetInternalPrefix() {
        // Test the get method to retrieve the internal prefix.
        Attributes attributes1 = new Attributes();

        attributes1.set("value1", "value1");

        String internalPrefix = attributes1.getInternalPrefix();

        if (internalPrefix != null) {
            System.out.println(internalPrefix);
        } else {
            System.out.println(null);
        }
    }

}