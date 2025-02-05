package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeVisitor;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.NodeFilter;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedChildNodeSizeWithChildTest {

    @Test
    public void childNodeSizeWithChildTest() {
        Element parent = new Element(Tag.valueOf("p"), "", new Attributes());
        Element child = new Element(Tag.valueOf("span"), "", new Attributes());
        parent.appendChild(child);
        assertEquals(1, parent.childNodeSize());
    }

}