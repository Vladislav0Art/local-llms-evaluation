package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedHasChildNodesScenarioTest {

    @Test
    public void hasChildNodesScenarioTest() {
        Element el = new Element("testName");
        assertFalse(el.hasChildNodes());
    }

}