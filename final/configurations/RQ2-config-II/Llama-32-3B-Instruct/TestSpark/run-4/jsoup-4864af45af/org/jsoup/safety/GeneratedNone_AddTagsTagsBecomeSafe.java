package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

public class GeneratedNone_AddTagsTagsBecomeSafe {

    @Test
    public void none_AddTagsTagsBecomeSafe() {
        Safelist safelist = Safelist.none();
        Safelist newSafelist = safelist.addTags("p");
        assertTrue(newSafelist.isSafeTag("p"));
    }

}