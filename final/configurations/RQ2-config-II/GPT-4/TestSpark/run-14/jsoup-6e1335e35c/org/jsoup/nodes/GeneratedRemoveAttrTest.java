package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttrTest {

    @Test
    public void removeAttrTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("id", "test");
        element.removeAttr("id");
        assertEquals("", element.id());
    }

}