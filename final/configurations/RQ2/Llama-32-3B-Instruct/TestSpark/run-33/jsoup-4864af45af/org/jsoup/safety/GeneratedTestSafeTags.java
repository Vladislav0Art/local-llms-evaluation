package org.jsoup.safety;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedTestSafeTags {

    @Test
    public void testSafeTags() {
        List<String> safeTags = new ArrayList<>();
        Set<String> relaxedTags = new HashSet<>();

        // Test adding and checking a tag
        safeTags.add("img");
        assertTrue(safeTags.contains("img"));
        assertFalse(relaxedTags.contains("img"));

        // Test adding and checking a relaxed tag
        relaxedTags.add("div");
        assertTrue(safeTags.contains("div"));
        assertTrue(relaxedTags.contains("div"));
    }

}