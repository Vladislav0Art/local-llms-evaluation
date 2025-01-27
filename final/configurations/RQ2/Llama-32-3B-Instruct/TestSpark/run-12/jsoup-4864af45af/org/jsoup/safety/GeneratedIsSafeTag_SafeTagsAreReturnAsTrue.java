package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedIsSafeTag_SafeTagsAreReturnAsTrue {

    @Test
    public void isSafeTag_SafeTagsAreReturnAsTrue() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("img"));
    }

}