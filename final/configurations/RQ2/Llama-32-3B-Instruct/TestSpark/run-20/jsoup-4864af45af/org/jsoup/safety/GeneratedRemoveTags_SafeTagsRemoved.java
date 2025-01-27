package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedRemoveTags_SafeTagsRemoved {

    @Test
    public void removeTags_SafeTagsRemoved() {
        Safelist safelist = Safelist.relaxed();
        Set<String> tagsToRemove = new HashSet<>(Arrays.asList("strong", "em"));
        Safelist updatedSafelist = safelist.removeTags(tagsToRemove.toArray(new String[0]));
        assertFalse(updatedSafelist.isSafeTag("strong"));
        assertFalse(updatedSafelist.isSafeTag("em"));
    }

}