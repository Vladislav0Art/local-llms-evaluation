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

public class GeneratedAttributesTest {

    @Test
    public void attributesTest() {
        Attributes attributes = new Attributes();
        String baseUri = "http://example.com/";
        attributes.put("key", "value");
        Element element = new Element(Tag.valueOf("p"), baseUri, attributes);
        assertEquals(1, element.attributes().size());
        assertTrue(element.hasAttributes());
    }

}