package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

public class GeneratedSimpleText_SafelistContainsOnlyTextTags {

    @Test
    public void simpleText_SafelistContainsOnlyTextTags() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("img"));
    }

}