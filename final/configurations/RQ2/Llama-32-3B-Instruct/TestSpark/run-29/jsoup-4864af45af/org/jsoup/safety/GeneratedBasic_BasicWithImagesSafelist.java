package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_BasicWithImagesSafelist {

    @Test
    public void basic_BasicWithImagesSafelist() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.getEnforcedAttributes("img").isEmpty());
    }

}