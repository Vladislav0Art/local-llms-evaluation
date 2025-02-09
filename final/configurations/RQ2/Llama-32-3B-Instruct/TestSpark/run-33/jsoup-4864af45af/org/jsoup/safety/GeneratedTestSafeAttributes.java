package org.jsoup.safety;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedTestSafeAttributes {

    @Test
    public void testSafeAttributes() {
        Set<String> safeAttributes = new HashSet<>();

        // Test adding and checking an attribute
        safeAttributes.add("href");
        assertTrue(safeAttributes.contains("href"));
        assertFalse(safeAttributes.contains("text"));

        // Test adding and checking a relaxed attribute
        List<String> relaxedAttributes = new ArrayList<>();
        relaxedAttributes.add("a");

        Set<String> relaxedAttributeSet = new HashSet<>(relaxedAttributes);
        safeAttributes.addAll(relaxedAttributeSet);
        assertTrue(safeAttributes.contains("href"));
        assertTrue(safeAttributes.contains("text"));
    }

}