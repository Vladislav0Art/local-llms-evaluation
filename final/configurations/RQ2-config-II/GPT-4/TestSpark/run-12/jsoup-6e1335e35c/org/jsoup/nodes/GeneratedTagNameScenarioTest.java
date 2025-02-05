package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedTagNameScenarioTest {

    @Test
    public void tagNameScenarioTest() {
        Element el = new Element("testName");
        assertEquals("testname", el.tagName());
    }

}