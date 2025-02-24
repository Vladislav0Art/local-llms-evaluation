package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetElementsByIndexEquals {

    @Test
    public void testGetElementsByIndexEquals() {
        Element element = new Element("div");
        Element child1 = element.appendElement("p");
        Element child2 = element.appendElement("p");
        Element child3 = element.appendElement("p");
        Elements result = element.getElementsByIndexEquals(1);
        assertEquals(1, result.size());
        assertEquals(child2, result.get(0));
    }

}