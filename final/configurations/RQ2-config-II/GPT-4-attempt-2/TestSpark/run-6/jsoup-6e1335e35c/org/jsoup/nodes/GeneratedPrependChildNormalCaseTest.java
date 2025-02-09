package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPrependChildNormalCaseTest {

    @Test
    public void prependChildNormalCaseTest() {
        Element element = new Element("div");
        Element firstChild = new Element("p");
        Element secondChild = new Element("a");
        element.appendChild(firstChild);
        element.prependChild(secondChild);
        assertEquals(secondChild, element.child(0));
        assertEquals(firstChild, element.child(1));
    }

}