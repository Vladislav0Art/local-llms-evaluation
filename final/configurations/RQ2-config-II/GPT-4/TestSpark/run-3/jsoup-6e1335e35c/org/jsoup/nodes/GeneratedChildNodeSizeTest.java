package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("tag");
        assertEquals(0, element.childNodeSize());
    }

}