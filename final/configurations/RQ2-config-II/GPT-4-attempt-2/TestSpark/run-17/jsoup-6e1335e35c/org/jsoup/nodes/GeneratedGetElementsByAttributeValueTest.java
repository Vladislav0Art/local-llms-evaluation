package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetElementsByAttributeValueTest {

    @Test
    public void getElementsByAttributeValueTest() {
        Element parent = new Element("div");
        Element child = new Element("input");
        child.attr("type", "text");
        parent.appendChild(child);
        assertEquals(1, parent.getElementsByAttributeValue("type", "text").size());
    }

}