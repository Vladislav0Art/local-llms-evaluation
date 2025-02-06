package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedRelaxed_RelaxedElementsAddedTest {

    @Test
    public void relaxed_RelaxedElementsAddedTest() {
        Safelist safelist = Safelist.relaxed();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img", "br");
        assertTrue(safelist.addTags(expectedTags).isSafeTag("img"));
    }

}