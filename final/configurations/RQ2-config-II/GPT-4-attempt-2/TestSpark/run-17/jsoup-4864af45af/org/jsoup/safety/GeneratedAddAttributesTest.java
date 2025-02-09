package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag", "attr1", "attr2");
        Element el = new Element("tag");
        el.attr("attr1", "value1");
        assertTrue(safelist.isSafeAttribute("tag", el, new Attribute("attr1", "value1")));
        assertTrue(safelist.isSafeAttribute("tag", el, new Attribute("attr2", "value2")));
    }

}