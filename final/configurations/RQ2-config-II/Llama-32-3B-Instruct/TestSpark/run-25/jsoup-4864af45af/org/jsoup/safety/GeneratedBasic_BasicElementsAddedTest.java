package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedBasic_BasicElementsAddedTest {

    @Test
    public void basic_BasicElementsAddedTest() {
        Safelist safelist = Safelist.basic();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img", "br", "p");
        assertTrue(safelist.addTags(expectedTags).isSafeTag("img"));
    }

}