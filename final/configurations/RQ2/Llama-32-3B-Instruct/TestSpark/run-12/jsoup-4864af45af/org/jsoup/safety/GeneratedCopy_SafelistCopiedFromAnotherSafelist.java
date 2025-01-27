package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedCopy_SafelistCopiedFromAnotherSafelist {

    @Test
    public void copy_SafelistCopiedFromAnotherSafelist() {
        Safelist safelist1 = Safelist.simpleText();
        Safelist safelist2 = new Safelist(safelist1);
        assertEquals(safelist1, safelist2);
    }

}