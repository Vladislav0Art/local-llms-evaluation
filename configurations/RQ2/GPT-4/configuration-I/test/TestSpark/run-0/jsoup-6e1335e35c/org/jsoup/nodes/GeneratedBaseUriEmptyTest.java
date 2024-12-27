package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedBaseUriEmptyTest {

    @Test
    public void baseUriEmptyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Element element = new Element(Tag.valueOf("p"), "", attributes);
        assertEquals("", element.baseUri());
    }

}