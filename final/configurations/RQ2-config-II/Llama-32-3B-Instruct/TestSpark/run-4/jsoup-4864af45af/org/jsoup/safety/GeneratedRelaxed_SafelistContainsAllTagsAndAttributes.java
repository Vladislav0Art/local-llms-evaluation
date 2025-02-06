package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

public class GeneratedRelaxed_SafelistContainsAllTagsAndAttributes {

    @Test
    public void relaxed_SafelistContainsAllTagsAndAttributes() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("div", null, null));
        assertTrue(safelist.isSafeTag("div"));
    }

}