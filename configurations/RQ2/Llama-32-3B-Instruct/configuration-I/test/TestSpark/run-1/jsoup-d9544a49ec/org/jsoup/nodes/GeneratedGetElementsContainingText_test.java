package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetElementsContainingText_test {

    @Test
    public void getElementsContainingText_test() {
        Element element = new Element("text");
        assertEquals(1, element.getElementsContainingText("text").size());
    }

}