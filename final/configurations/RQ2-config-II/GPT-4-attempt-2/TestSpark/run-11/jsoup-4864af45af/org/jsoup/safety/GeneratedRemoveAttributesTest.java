package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        String[] attributes = {"style"};
        safelist.addAttributes("p", attributes);
        safelist.removeAttributes("p", "style");
        Element element = new Element("p");
        element.attr("style", "bold");
        assertFalse(safelist.isSafeAttribute("p", element, new Attribute("style", "bold")));
    }

}