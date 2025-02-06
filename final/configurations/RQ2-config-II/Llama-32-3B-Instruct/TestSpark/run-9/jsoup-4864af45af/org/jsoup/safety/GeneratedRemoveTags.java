package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveTags {

    @Test
    public void removeTags() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithRemovedTags = safelist.removeTags("p", "span");
        assertFalse(safelistWithRemovedTags.isSafeTag("p"));
        assertTrue(safelistWithRemovedTags.isSafeTag("script"));
    }

}