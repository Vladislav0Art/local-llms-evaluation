package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedRelaxed {

    @Test
    public void relaxed() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("a"));
    }

}