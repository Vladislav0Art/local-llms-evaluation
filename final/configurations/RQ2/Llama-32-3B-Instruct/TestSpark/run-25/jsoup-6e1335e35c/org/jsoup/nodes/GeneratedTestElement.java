package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestElement {

    @Test
    public void testElement() {
        // create element
        Element element = new Element();
        // assert properties
        assertEquals("", element.getCssSelector());
        assertEquals(0, element.getElementSiblingIndex());
        assertTrue(element.hasText());
    }
}

public class Node {

    private String cssSelector;
    private int elementSiblingIndex;

    public String getCssSelector() {
        return cssSelector;
    }

    public void setCssSelector(String cssSelector) {
        this.cssSelector = cssSelector;
    }

    public int getElementSiblingIndex() {
        return elementSiblingIndex;
    }

    public void setElementSiblingIndex(int elementSiblingIndex) {
        this.elementSiblingIndex = elementSiblingIndex;
    }
}

public class Element extends Node {

    @Override
    public String html(String html) {
        // implementation
        return "";
    }

    @Override
    public <T extends Appendable> T html(T appendable) {
        // implementation
        return null;
    }

    @Override
    public void setCssSelector(String cssSelector) {
        super.setCssSelector(cssSelector);
    }
}

}