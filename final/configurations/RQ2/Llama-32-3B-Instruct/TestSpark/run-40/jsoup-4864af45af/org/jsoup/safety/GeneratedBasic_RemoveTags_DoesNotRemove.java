package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedBasic_RemoveTags_DoesNotRemove {

    @Test
    public void basic_RemoveTags_DoesNotRemove() {
        Safelist safelist = Safelist.basic();
        String[] removedTags = safelist.getRemovedTags();
        assertTrue(removedTags == null || removedTags.length == 0);
    }

}