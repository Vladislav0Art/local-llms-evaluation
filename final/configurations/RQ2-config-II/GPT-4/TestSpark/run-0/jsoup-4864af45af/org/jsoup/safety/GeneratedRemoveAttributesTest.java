package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag", "attr1", "attr2");
        safelist.removeAttributes("tag", "attr2");
        Element element = new Element("tag");
        element.attr("attr2", "value2");
        assertFalse(safelist.isSafeAttribute("tag", element, element.attributes().asList().get(0)));
    }

}