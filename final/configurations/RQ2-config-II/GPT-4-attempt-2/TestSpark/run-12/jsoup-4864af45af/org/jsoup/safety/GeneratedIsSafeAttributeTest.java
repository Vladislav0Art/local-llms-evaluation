package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        String tagName = "p";
        Element el = new Element("p");
        Attribute attr = new Attribute("class", "example");
        boolean result = new Safelist().isSafeAttribute(tagName, el, attr);
        assertTrue(result);
    }

}