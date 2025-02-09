package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedTagNameChangeTest {

    @Test
    public void tagNameChangeTest() {
        Element element = new Element("testTag");
        element.tagName("newTestTag");
        assertEquals("newTestTag", element.tagName());
    }

}