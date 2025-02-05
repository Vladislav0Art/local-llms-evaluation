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

public class GeneratedChildNodeSizeWithoutChildTest {

    @Test
    public void childNodeSizeWithoutChildTest() {
        Element parent = new Element(Tag.valueOf("p"), "", new Attributes());
        assertEquals(0, parent.childNodeSize());
    }

}