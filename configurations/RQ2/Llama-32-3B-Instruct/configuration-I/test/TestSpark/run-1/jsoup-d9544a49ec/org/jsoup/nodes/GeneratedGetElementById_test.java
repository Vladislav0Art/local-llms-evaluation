package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetElementById_test {

    @Test
    public void getElementById_test() {
        Element element = new Element("test");
        element.setId("id");
        assertEquals(element, element.getElementById("id"));
    }

}