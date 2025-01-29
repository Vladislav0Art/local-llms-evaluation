package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedBasic {

    @Test
    public void basic() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("img"));
    }

}