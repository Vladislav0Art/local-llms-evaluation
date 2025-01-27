package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedRemoveTags_SimpleTextWithRemovedTagSafelist {

    @Test
    public void removeTags_SimpleTextWithRemovedTagSafelist() {
        Safelist safelist = Safelist.simpleText();
        safelist = safelist.removeTags("p");
        assertFalse(safelist.isSafeTag("p"));
    }

}