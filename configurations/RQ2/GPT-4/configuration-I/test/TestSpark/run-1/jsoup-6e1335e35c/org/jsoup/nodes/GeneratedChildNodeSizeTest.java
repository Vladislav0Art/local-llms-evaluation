package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("tag");
        Element child1 = new Element("childTag1");
        Element child2 = new Element("childTag2");
        element.appendChild(child1);
        element.appendChild(child2);
        assertEquals(2, element.childNodeSize());
    }

}