package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedRemoveTagsRemovesTagsFromSafelist {

    @Test
    public void removeTagsRemovesTagsFromSafelist() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithoutTags = safelist.removeTags("img");
        assertNotNull(safelistWithoutTags);
        assertFalse(safelistWithoutTags.isSafeTag("img"));
    }

}