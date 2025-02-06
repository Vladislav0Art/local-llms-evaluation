package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

public class GeneratedBasic_removeTagsTagsBecomeNotSafe {

    @Test
    public void basic_removeTagsTagsBecomeNotSafe() {
        Safelist safelist = Safelist.basic();
        Safelist newSafelist = safelist.removeTags("p");
        assertFalse(newSafelist.isSafeTag("p"));
    }

}