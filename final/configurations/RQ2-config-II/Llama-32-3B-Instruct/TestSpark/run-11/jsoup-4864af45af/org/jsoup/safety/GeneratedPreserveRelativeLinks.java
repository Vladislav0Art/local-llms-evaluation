package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashSet;

public class GeneratedPreserveRelativeLinks {

    @Test
    public void preserveRelativeLinks() {
        Safelist safelist = Safelist.preserveRelativeLinks(false);
        assertTrue(!safelist.isSafeTag("base"));
        assertFalse(safelist.isSafeAttribute("a", null, null));
        assertNull(safelist.getEnforcedAttributes("a"));
    }

}