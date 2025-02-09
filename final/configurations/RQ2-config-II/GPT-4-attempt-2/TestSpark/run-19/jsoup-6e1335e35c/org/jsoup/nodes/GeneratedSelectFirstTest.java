package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedSelectFirstTest {

    @Test
    public void selectFirstTest() {
        Element parent = new Element("parent");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, parent.selectFirst("child"));
    }

}