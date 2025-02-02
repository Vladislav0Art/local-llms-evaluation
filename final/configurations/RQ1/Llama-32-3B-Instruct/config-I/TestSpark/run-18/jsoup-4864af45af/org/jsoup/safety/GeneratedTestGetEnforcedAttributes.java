package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetEnforcedAttributes {

    @Test
    public void testGetEnforcedAttributes() {
        Config config = new Config();
        String tagName = "All";
        Element element = new Element(tagName, "");

        Attributes expectedAttributes = new Attributes().put("script", "js");
        assertEquals(expectedAttributes, config.getEnforcedAttributes(tagName));
    }

}