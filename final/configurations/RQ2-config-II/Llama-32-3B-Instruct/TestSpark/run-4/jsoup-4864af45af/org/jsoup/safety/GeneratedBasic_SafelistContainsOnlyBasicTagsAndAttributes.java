package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

public class GeneratedBasic_SafelistContainsOnlyBasicTagsAndAttributes {

    @Test
    public void basic_SafelistContainsOnlyBasicTagsAndAttributes() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeAttribute("div", null, null));
        assertTrue(safelist.isSafeTag("div"));
    }

}