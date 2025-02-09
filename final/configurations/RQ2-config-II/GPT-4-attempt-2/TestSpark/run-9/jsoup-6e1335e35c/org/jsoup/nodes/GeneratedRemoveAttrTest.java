package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedRemoveAttrTest {

    @Test
    public void removeAttrTest() {
        Element element = new Element("div");
        element.attr("style", "color: red");
        element.removeAttr("style");
        assertFalse(element.hasAttr("style"));
    }

}