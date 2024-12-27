package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    // Testing public static methods

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag1", "attr1", "attr2");
        safelist.removeAttributes("tag1", "attr1");
        Element element = new Element("tag1");
        element.attr("attr1", "");
        assertFalse(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "")));
    }

}