package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedPreserveRelativeLinks {

    @Test
    public void preserveRelativeLinks() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("script"));
    }

}