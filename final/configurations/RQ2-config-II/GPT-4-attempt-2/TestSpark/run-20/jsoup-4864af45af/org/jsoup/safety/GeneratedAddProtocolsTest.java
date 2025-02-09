package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag").addProtocols("tag", "attr", "protocol");

        Attribute attr = new Attribute("attr", "protocol:");
        Element el = new Element("tag");
        el.attributes().put(attr);

        assertTrue(safelist.isSafeAttribute("tag", el, attr));
    }

}