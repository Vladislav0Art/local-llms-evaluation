package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetElementsMatchingOwnText_test {

    @Test
    public void getElementsMatchingOwnText_test() {
        Element element = new Element("test");
        assertEquals(1, element.getElementsMatchingOwnText("test").size());
    }

}