package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedEmptyScenarioTest {

    @Test
    public void emptyScenarioTest() {
        Element parent = new Element("testName");
        Element child = new Element("child");
        parent.appendChild(child);

        assertTrue(parent.hasChildNodes());
        assertEquals(1, parent.childNodeSize());

        parent.empty();

        assertFalse(parent.hasChildNodes());
        assertEquals(0, parent.childNodeSize());
    }

}