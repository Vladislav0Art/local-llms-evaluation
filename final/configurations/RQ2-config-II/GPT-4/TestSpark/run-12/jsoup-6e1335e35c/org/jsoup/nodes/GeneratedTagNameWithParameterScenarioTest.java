package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedTagNameWithParameterScenarioTest {

    @Test
    public void tagNameWithParameterScenarioTest() {
        Element el = new Element("testName");
        el.tagName("newTagName");
        assertEquals("newtagname", el.tagName());
    }

}