package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testGetElementsByIndexLessThan() {
        Element element = new Element("div");
        Element child1 = element.appendElement("p");
        Element child2 = element.appendElement("p");
        Element child3 = element.appendElement("p");
        Elements result = element.getElementsByIndexLessThan(1);
        assertEquals(1, result.size());
        assertEquals(child1, result.get(0));
    }

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