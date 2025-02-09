package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag").addAttributes("tag", "attr");

        Attribute attr = new Attribute("attr", "value");
        Element el = new Element("tag");
        el.attributes().put(attr);

        assertTrue(safelist.isSafeAttribute("tag", el, attr));
    }

}