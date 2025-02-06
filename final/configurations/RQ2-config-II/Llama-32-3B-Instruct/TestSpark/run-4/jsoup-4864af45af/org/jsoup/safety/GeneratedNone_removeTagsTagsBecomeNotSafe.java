package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

public class GeneratedNone_removeTagsTagsBecomeNotSafe {

    @Test
    public void none_removeTagsTagsBecomeNotSafe() {
        Safelist safelist = Safelist.none();
        Safelist newSafelist = safelist.removeTags("p");
        assertFalse(newSafelist.isSafeTag("p"));
    }

}