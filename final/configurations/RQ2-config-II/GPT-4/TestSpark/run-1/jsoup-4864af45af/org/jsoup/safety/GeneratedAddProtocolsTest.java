package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist().addTags("tag1").addProtocols("tag1", "attr1", "protocol1");
        Element element = new Element("tag1");
        element.attr("attr1", "protocol1:value1");
        Attribute attr1 = element.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("tag1", element, attr1));
    }

}