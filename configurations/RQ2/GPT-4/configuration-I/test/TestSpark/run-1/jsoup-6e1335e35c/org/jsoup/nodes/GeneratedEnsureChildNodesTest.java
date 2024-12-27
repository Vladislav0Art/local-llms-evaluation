package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedEnsureChildNodesTest {

    @Test
    public void ensureChildNodesTest() {
        Element element = new Element("tag");
        Element child = new Element("childTag");
        element.appendChild(child);
        assertNotNull(element.ensureChildNodes());
        assertEquals(1, element.ensureChildNodes().size());
    }

}