package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedBasicRemoveTags_BasicElementsRemovesBasicTagsTest {

    @Test
    public void basicRemoveTags_BasicElementsRemovesBasicTagsTest() {
        Safelist safelist = Safelist.basic();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img", "br");
        Safelist newSafelist = safelist.removeTags(expectedTags);
        assertFalse(newSafelist.isSafeTag("img"));
    }

}