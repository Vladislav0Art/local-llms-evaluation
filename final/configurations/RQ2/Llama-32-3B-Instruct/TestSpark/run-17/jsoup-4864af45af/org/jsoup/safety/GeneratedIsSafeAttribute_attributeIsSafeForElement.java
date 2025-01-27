package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedIsSafeAttribute_attributeIsSafeForElement {

    @Test
    public void isSafeAttribute_attributeIsSafeForElement() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element();
        Attribute attribute = new Attribute();
        assertTrue(safelist.isSafeAttribute("rel", element, attribute));
    }

}