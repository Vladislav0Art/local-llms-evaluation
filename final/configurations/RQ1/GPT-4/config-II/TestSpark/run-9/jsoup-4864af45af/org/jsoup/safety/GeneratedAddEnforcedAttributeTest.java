package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        Attribute enforcedAttr = new Attribute("rel", "nofollow");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), enforcedAttr));
    }

}