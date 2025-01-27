package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedAddTags_SafeTagsAdded {

    @Test
    public void addTags_SafeTagsAdded() {
        Safelist safelist = Safelist.relaxed();
        Set<String> tagsToAdd = new HashSet<>(Arrays.asList("script", "iframe"));
        Safelist updatedSafelist = safelist.addTags(tagsToAdd.toArray(new String[0]));
        assertTrue(updatedSafelist.isSafeTag("script"));
        assertTrue(updatedSafelist.isSafeTag("iframe"));
    }

}