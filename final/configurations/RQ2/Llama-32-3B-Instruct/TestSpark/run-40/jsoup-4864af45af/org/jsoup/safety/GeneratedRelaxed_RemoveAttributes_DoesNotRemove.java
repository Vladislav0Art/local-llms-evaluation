package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedRelaxed_RemoveAttributes_DoesNotRemove {

    @Test
    public void relaxed_RemoveAttributes_DoesNotRemove() {
        Safelist safelist = Safelist.relaxed();
        String[] removedTags = safelist.getRemovedTags();
        assertTrue(removedTags == null || removedTags.length == 0);
    }

}