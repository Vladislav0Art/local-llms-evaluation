package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeAttributes("body", "charset");

        Attribute attr = new Attribute("charset", "utf-8");
        Element el = new Element("body");
        el.attributes().put(attr);

        assertFalse(safelist.isSafeAttribute("body", el, attr));
    }

}