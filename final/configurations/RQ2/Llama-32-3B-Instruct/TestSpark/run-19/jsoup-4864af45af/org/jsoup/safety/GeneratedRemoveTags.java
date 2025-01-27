package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

public class GeneratedRemoveTags {

    @Test
    public void removeTags() {
        Safelist safelist = Safelist.addTags("a", "b").addTags();
        assertFalse(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("b"));
    }

}