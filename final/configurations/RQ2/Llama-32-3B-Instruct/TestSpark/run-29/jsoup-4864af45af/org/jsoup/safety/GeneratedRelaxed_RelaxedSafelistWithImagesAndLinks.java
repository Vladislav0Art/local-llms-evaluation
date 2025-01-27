package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedRelaxed_RelaxedSafelistWithImagesAndLinks {

    @Test
    public void relaxed_RelaxedSafelistWithImagesAndLinks() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
    }

}