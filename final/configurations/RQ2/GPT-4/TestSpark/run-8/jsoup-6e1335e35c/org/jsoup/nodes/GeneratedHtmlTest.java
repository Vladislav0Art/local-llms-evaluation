package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.jsoup.parser.Tag;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element element = new Element(Tag.valueOf("div"), "http://www.test.com");
        element.html("<p>Test</p>");
        assertEquals("<p>Test</p>", element.html());
    }

}