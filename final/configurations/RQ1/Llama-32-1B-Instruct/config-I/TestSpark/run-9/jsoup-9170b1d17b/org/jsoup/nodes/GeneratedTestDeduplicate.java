package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestDeduplicate {

    @Test
    public void testDeduplicate() {
        // Test the deduplicate method to remove duplicate attribute.
        Attributes attributes1 = new Attributes();

        attributes1.set("value1", "value2");
        attributes1.normalize();

        int dupes = attributes1.deduplicate(ParseSettings.preserveAttributeCase()).size();

        System.out.println(dupes);
    }

}