package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRootTest {

    @Test
    public void rootTest() {
        Element element = new Element("div");
        assertEquals(element, element.root());
    }

}