package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        Attribute attr = new Attribute("attrKey", "attrValue");
        Element el = new Element("tagName");
        boolean result = safelist.isSafeAttribute("tagName", el, attr);
        assertFalse(result);
    }

}