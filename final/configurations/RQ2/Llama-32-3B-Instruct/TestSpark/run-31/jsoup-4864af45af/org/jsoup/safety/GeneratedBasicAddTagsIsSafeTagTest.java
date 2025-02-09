package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicAddTagsIsSafeTagTest {

    @Test
    public void basicAddTagsIsSafeTagTest() {
        Safelist safelist = Safelist.basic().addTags("img");
        assertTrue(safelist.isSafeTag("img"));
    }

}