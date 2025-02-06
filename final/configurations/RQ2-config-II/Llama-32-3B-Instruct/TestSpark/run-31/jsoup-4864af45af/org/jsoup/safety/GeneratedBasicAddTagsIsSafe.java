package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedBasicAddTagsIsSafe {

    @Test
    public void basicAddTagsIsSafe() {
        Safelist safelist = Safelist.basic();
        safelist.addTags("img");
        assertTrue(safelist.isSafeTag("img"));
    }

}