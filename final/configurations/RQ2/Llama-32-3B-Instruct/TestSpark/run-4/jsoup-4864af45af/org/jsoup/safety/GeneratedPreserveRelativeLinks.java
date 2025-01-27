package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedPreserveRelativeLinks {

    @Test
    public void preserveRelativeLinks() {
        Safelist basic = Safelist.basic();
        Safelist withPreservedLinks = Safelist.preserveRelativeLinks(true);
        assertFalse(withPreservedLinks.isSafeAttribute("href", new Element(), new Attribute("a")));
    }

}