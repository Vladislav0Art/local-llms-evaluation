package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a");
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        Element el = new Element("a");
        el.attr("rel", "noindex");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
        el.attr("rel", "notnofollow");
        attr = el.attributes().asList().get(0);
        assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

}