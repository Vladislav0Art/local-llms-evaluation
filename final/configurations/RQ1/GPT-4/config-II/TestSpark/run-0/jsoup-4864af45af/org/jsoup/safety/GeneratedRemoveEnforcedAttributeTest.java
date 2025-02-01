package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a");
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        safelist.removeEnforcedAttribute("a", "rel");
        Element element = new Element("a");
        element.attr("rel", "nofollow");
        Attribute attribute = element.attributes().asList().get(0);
        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

}