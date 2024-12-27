package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedElementClassNameTest {

    @Test
    public void ElementClassNameTest() {
        Element element = new Element("div");
        element.addClass("test");
        assertEquals("test", element.className());
    }

}