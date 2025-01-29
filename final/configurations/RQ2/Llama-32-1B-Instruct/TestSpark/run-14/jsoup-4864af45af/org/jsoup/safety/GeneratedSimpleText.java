package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedSimpleText {

    @Test
    public void simpleText() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("span"));
    }

}