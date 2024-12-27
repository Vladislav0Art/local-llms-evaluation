package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributesTest {

    @Test
    public void attributesTest() {
        Element element = new Element("tag");
        assertNotNull(element.attributes());
    }

}