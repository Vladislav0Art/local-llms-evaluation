package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        Attribute attr = new Attribute("attr", "value");
        Element el = new Element("tag");
        el.attr("attr", "value");
        boolean isSafe = safelist.isSafeAttribute("tag", el, attr);
        assertTrue(isSafe);
    }

}