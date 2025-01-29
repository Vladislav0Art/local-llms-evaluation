package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSimpleText {

    @Test
    public void testSimpleText() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("test", "test"));
    }

}