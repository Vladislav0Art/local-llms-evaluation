package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTestNormalize {

    @Test
    public void testNormalize() {
        Document document = new Element("html").appendText("test");
        Attributes attributes = document.attributes();
        assertEquals(1, attributes.normalize());
    }

}