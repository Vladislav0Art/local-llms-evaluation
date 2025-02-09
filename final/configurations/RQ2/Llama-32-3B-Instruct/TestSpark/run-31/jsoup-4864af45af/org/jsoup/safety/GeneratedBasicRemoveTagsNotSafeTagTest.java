package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicRemoveTagsNotSafeTagTest {

    @Test
    public void basicRemoveTagsNotSafeTagTest() {
        Safelist safelist = Safelist.basic().removeTags("script");
        assertFalse(safelist.isSafeTag("script"));
    }

}