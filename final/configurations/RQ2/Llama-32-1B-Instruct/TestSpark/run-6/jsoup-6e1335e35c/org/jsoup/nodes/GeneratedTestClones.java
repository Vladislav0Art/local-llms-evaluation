package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestClones {

    @Test
    public void testClones() {
        Element parent = new Element("parent");
        clone(parent);
        assertAllSame(parent, parent.clone());

        // Test shallow cloning
        String text = "Hello, World!";
        Object clonedText = shallowClone(text);
        assertNotSame(text, clonedText);

        // Test deep cloning
        Object original = new Object();
        Object clonedOriginal = shallowClone(original);
        assertNotSame(original, clonedOriginal);
    }

}