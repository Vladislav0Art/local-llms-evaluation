package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestPreserveRelativeLinks {

    @Test
    public void testPreserveRelativeLinks() {
        Safelist safelist = new Safelist(Safelist.preserveRelativeLinks(true));
        Element element = new Element();
        element.appendChild(new Element("img", Map.of()));
        assertFalse(safelist.isSafeTag("a"));
    }

}