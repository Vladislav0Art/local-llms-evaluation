package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendTextTest {

    @Test
    public void appendTextTest() {
        Element element = new Element("tag");
        element.appendText("test");
        assertEquals("test", element.text());
    }

}