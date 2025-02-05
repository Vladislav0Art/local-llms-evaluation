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

public class GeneratedTraverseTest {

    @Test
    public void traverseTest() {
        Element element = new Element("p");
        element.traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int i) {
                assertEquals("p", node.nodeName());
            }

            @Override
            public void tail(Node node, int i) {
                assertEquals("p", node.nodeName());
            }
        });
    }

}