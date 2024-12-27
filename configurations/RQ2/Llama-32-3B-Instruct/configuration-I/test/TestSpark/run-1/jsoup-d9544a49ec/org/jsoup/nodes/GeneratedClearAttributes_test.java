package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedClearAttributes_test {

    @Test
    public void clearAttributes_test() {
        Element element = new Element("test");
        element.setAttribute("attr", "value");
        assertEquals(0, element.clearAttributes().getAttributeCount());
    }

}