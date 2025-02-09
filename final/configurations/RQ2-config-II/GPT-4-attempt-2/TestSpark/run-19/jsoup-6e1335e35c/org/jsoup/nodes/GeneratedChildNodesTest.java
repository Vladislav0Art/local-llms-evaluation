package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedChildNodesTest {

    @Test
    public void childNodesTest() {
        Element parent = new Element("parent");
        assertFalse(parent.hasChildNodes());
        parent.appendChild(new Element("child"));
        assertTrue(parent.hasChildNodes());
    }

}