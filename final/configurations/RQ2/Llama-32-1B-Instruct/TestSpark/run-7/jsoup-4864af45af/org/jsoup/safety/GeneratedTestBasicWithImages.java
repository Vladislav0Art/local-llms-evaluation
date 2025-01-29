package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestBasicWithImages {

    @Test
    public void testBasicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("tag", "test"));
        assertFalse(safelist.isSafeAttribute("image", "src"));
    }

}