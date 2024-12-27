package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendChild_toElementTest {

    @Test
    public void appendChild_toElementTest() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.appendChild(child);
        assertNotNull(child.getParent());
    }

}