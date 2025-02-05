package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist().addTags("tag").addAttributes("tag", "attr1", "attr2");
        safelist.removeAttributes("tag", "attr1", "attr2");
        Element element = new Element("tag");
        element.attr("attr1", "value1");
        element.attr("attr2", "value2");
        Attribute attr1 = element.attributes().asList().get(0);
        Attribute attr2 = element.attributes().asList().get(1);
        assertFalse(safelist.isSafeAttribute("tag", element, attr1));
        assertFalse(safelist.isSafeAttribute("tag", element, attr2));
    }

}