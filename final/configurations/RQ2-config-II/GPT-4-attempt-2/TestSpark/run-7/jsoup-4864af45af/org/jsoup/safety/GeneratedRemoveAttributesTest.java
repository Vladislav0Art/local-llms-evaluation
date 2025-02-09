package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "title");
        safelist.removeAttributes("a", "title");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href")));
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("title")));
    }

}