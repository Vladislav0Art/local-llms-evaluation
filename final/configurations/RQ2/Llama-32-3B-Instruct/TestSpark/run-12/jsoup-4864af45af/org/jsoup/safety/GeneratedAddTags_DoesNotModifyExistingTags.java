package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAddTags_DoesNotModifyExistingTags {

    @Test
    public void addTags_DoesNotModifyExistingTags() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithTags = safelist.addTags("img", "a");
        assertFalse(safelistWithTags.isSafeAttribute("img", null, null));
    }

}