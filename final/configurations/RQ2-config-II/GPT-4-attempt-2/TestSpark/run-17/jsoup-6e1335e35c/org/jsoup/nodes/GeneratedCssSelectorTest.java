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

public class GeneratedCssSelectorTest {

    @Test
    public void cssSelectorTest() {
        Element element = new Element("input");
        element.attr("type", "text");
        assertEquals("input[type=text]", element.cssSelector());
    }

}