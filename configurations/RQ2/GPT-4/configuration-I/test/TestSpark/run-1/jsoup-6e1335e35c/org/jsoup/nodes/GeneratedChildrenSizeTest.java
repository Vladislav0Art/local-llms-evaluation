package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedChildrenSizeTest {

    @Test
    public void childrenSizeTest() {
        Element parent = new Element("parent");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(2, parent.childrenSize());
    }

}