package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedAddTags_NoArgumentsAddsNoTagsTest {

    @Test
    public void addTags_NoArgumentsAddsNoTagsTest() {
        Safelist safelist = Safelist.none();
        Set<String> expectedTags = new HashSet<>();
        Safelist newSafelist = safelist.addTags(expectedTags);
        assertFalse(newSafelist.isSafeTag(""));
    }

}