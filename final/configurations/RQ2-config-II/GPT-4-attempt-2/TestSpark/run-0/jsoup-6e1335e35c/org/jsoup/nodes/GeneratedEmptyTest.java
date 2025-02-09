package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEmptyTest {

    @Test
    public void emptyTest() {
        Element parent = new Element("div");
        parent.appendElement("p");
        parent.empty();
        assertEquals(0, parent.childNodeSize());
    }

}