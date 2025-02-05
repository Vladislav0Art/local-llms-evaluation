package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("Tag1", "Attribute1", "https");
        safelist.removeProtocols("Tag1", "Attribute1", "https");
        Element element = new Element("Tag1");
        element.attributes().put("Attribute1", "https://example.com");
        Assert.assertFalse(safelist.isSafeAttribute("Tag1", element, new Attribute("Attribute1", "https://example.com")));
    }

}