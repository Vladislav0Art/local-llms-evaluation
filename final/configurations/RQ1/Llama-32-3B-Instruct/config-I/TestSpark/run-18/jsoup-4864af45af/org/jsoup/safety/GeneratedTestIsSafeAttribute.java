package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsSafeAttribute {

    @Test
    public void testIsSafeAttribute() {
        Config config = new Config();
        Element element = new Element("html", "body");
        Attribute attribute = new Attribute("src", "http://example.com/script.js");

        assertTrue(config.isSafeAttribute("All", element, attribute));

        config.setPreserveRelativeLinks(true);
        assertFalse(config.isSafeAttribute("All", element, attribute));

        config.setEnforcedAttributes(All, new Attributes().put("script", "js"));
        assertTrue(config.isSafeAttribute("All", element, attribute));

        config.setEnforcedAttributes("body", new Attributes().put("style", "css"));
        assertFalse(config.isSafeAttribute("body", element, attribute));
    }

}