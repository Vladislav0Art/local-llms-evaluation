package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedRemoveTags_SafelistModification {

    @Test
    public void removeTags_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("p", "div");
        safelist = Safelist.removeTags("p", "div");
        assertNotNull(safelist);
        assertFalse(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("div"));
    }

}