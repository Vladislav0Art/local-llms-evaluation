package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedSimpleText_SimpleTextAddedTest {

    @Test
    public void simpleText_SimpleTextAddedTest() {
        Safelist safelist = Safelist.simpleText();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("text");
        assertTrue(safelist.addTags(expectedTags).isSafeTag("text"));
    }

}