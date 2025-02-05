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

public class GeneratedFilterTest {

    @Test
    public void filterTest() {
        Element element = new Element("p");
        element.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {
                return FilterResult.REMOVE;
            }

            @Override
            public FilterResult tail(Node node, int depth) {
                return FilterResult.REMOVE;
            }
        });
    }

}