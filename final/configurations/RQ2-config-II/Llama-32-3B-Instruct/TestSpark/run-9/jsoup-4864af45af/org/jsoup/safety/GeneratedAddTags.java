package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddTags {

    @Test
    public void addTags() {
        Safelist safelist = Safelist.addTags("a");
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("script"));
    }

}