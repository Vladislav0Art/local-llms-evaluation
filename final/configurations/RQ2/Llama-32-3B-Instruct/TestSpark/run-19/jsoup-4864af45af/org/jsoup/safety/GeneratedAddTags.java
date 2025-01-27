package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

public class GeneratedAddTags {

    @Test
    public void addTags() {
        Safelist safelist = Safelist.addTags("a", "b");
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("b"));
    }

}