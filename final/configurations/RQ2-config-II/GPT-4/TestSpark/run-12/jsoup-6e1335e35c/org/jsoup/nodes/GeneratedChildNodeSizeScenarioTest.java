package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedChildNodeSizeScenarioTest {

    @Test
    public void childNodeSizeScenarioTest() {
        Element el = new Element("testName");
        assertEquals(0, el.childNodeSize());
    }

}