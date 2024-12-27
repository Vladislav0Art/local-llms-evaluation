package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        Element element = new Element("tag");
        element.attr("attrKey", "attrValue");
        assertEquals("attrKey=\"attrValue\"", element.data());
    }

}