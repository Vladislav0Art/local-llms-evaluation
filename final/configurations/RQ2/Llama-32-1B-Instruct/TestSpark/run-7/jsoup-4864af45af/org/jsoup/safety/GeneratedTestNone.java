package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestNone {

    @Test
    public void testNone() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeAttribute("tag", "test"));
    }

}