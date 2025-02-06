package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedAddTags_SafelistModification {

    @Test
    public void addTags_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("p", "div");
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("div"));
    }

}