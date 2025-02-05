package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag", "attr1", "attr2");
        safelist.removeAttributes("tag", "attr1");
        Element element = new Element("tag");
        element.attr("attr1", "value1");
        Attribute attribute = element.attributes().iterator().next();
        assertFalse(safelist.isSafeAttribute("tag", element, attribute));
    }

}