package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedSimpleText {

    @Test
    public void simpleText() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.getEnforcedAttributes("span").size() > 0);
        assertTrue(!safelist.getEnforcedAttributes("a").isEmpty());
    }

}