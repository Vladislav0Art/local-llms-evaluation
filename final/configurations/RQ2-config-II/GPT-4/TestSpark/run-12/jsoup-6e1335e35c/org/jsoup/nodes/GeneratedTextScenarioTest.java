package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedTextScenarioTest {

    @Test
    public void textScenarioTest() {
        Element element = new Element("testName");
        element.text("Hello, World!");

        assertEquals("Hello, World!", element.text());
    }

}