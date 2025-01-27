package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedAddTags_SimpleTextWithAddedTagSafelist {

    @Test
    public void addTags_SimpleTextWithAddedTagSafelist() {
        Safelist safelist = Safelist.simpleText();
        safelist = safelist.addTags("script");
        assertTrue(safelist.isSafeTag("script"));
    }

}