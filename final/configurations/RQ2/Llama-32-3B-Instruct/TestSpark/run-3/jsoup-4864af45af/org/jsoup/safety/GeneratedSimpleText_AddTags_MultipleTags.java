package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedSimpleText_AddTags_MultipleTags {

    @Test
    public void simpleText_AddTags_MultipleTags() {
        Safelist simpleText = Safelist.simpleText();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("a");
        expectedTags.add("b");
        expectedTags.add("c");
        simpleText = simpleText.addTags("a", "b", "c");
        assertTrue(simpleText.isSafeTag("a"));
        assertTrue(simpleText.isSafeTag("b"));
        assertTrue(simpleText.isSafeTag("c"));
    }

}