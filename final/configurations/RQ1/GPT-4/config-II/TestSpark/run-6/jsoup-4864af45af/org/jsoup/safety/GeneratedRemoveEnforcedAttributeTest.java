package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");

        Attributes attrs = safelist.getEnforcedAttributes("a");

        assertTrue(attrs.hasKey("rel"));
        assertEquals(attrs.get("rel"), "nofollow");

        safelist.removeEnforcedAttribute("a", "rel");

        attrs = safelist.getEnforcedAttributes("a");

        assertFalse(attrs.hasKey("rel"));
    }

}