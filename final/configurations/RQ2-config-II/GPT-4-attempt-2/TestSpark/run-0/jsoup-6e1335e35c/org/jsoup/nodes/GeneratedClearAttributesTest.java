package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedClearAttributesTest {

    @Test
    public void clearAttributesTest() {
        Element element = new Element("p").attr("class", "test").clearAttributes();
        assertNull(element.attr("class"));
    }

}