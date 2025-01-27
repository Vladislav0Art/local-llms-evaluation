package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedSimpleText_AddTags {

    @Test
    public void simpleText_AddTags() {
        Safelist simpleText = Safelist.simpleText();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("a");
        expectedTags.add("b");
        simpleText = simpleText.addTags("a", "b");
        assertTrue(simpleText.isSafeTag("a"));
        assertTrue(simpleText.isSafeTag("b"));
    }

}