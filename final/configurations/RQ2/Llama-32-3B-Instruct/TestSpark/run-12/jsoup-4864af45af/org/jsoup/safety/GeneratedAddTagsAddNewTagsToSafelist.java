package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAddTagsAddNewTagsToSafelist {

    @Test
    public void addTagsAddNewTagsToSafelist() {
        Safelist safelist = Safelist.none();
        Safelist safelistWithTags = safelist.addTags("img", "a");
        assertNotNull(safelistWithTags);
        assertTrue(safelistWithTags.isSafeTag("img"));
    }

}