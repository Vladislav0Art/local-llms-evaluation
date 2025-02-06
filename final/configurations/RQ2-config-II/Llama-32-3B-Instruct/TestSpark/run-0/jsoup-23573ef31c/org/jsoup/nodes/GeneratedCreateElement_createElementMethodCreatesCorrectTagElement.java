package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCreateElement_createElementMethodCreatesCorrectTagElement {

    @Test
    public void createElement_createElementMethodCreatesCorrectTagElement() {
        String expectedTagName = "p";
        Element element = document.createElement(expectedTagName);
        assertNotNull(element);
        assertTrue(element.tagName().equals(expectedTagName));
    }

}