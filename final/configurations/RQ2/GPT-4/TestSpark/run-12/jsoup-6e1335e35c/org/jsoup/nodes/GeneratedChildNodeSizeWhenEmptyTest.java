package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedChildNodeSizeWhenEmptyTest {

    @Test
    public void childNodeSizeWhenEmptyTest() {
        Element element = new Element("div");
        assertEquals(0, element.childNodeSize());
    }

}