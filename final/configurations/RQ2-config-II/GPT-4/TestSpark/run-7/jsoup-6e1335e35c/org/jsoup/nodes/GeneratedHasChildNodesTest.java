package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element parent = new Element("div");
        assertFalse(parent.hasChildNodes());

        Node child = Parser.parse("<p>Child</p>", "");
        parent.appendChild(child);
        assertTrue(parent.hasChildNodes());
    }

}