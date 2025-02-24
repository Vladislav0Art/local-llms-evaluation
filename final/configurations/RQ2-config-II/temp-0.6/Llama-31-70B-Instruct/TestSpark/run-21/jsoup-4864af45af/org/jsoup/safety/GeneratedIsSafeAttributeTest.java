package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    private Safelist safelist = new Safelist();

    @Test
    public void isSafeAttributeTest() {
        Element element = new Element("div");
        Attribute attribute = new Attribute("id", "test");
        assertTrue(safelist.isSafeAttribute("div", element, attribute));
    }

}