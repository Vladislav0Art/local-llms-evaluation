package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetElementsByIndexGreaterThan {

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element element = new Element("div");
        Element child1 = element.appendElement("p");
        Element child2 = element.appendElement("p");
        Element child3 = element.appendElement("p");
        Elements result = element.getElementsByIndexGreaterThan(1);
        assertEquals(2, result.size());
        assertEquals(child2, result.get(0));
        assertEquals(child3, result.get(1));
    }

}